package org.weshzhu.gatewaydemo.filter;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

/**
 * @author weshzhu
 */
@Component
@Slf4j
public class GlobalLogGatewayFilter implements GlobalFilter, Ordered {
    

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("*******************test the global gateway filter");
//        String uname = exchange.getRequest().getQueryParams().getFirst("uname");

        String logServerIp = exchange.getRequest().getHeaders().getFirst("logServerIp");
        String logServerPort = Objects.requireNonNull(
                exchange.getRequest().getHeaders().getFirst("logServerPort"));

        if (StringUtils.isNotEmpty(logServerIp) && StringUtils.isNotEmpty(logServerPort) ){
            URI url = exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR);
            try {
                assert url != null;
                URI newUrl = new URI(
                        "http",
                        url.getUserInfo(),
                        logServerIp,
                        Integer.parseInt(logServerPort),
                        url.getPath(),
                        url.getQuery(),
                        url.getFragment()
                );
                exchange.getAttributes().put(GATEWAY_REQUEST_URL_ATTR, newUrl);
            } catch (URISyntaxException e) {
                exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
                log.error("获取日志请求头: logServerIp={} 错误：{}", logServerIp, e.getMessage());
                return exchange.getResponse().setComplete();
            }
        }
        /*

        if (uname == null) {
            logger.error("用户名和密码不能为空");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            // 退出过滤器链，不在执行下面的过滤器链
            return exchange.getResponse().setComplete();
        }
         */
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() { // 数字越小，优先级越高
        return 10900;
    }
}
