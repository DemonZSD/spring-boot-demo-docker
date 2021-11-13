package org.weshzhu.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demonzsd.common.api.response.BaseResp;
import org.demonzsd.common.api.response.SingletonResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.*;
import org.weshzhu.swaggerdemo.controller.requests.DemoReq;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Demo controller
 * @author zsd
 */
@RestController
@Api(tags = "Demo 管理功能")
public class DemoController {
    @Autowired
    private ServerProperties serverProperties;
    @GetMapping("/demo/{id}")
    @ApiOperation("查询Demo接口")
    private SingletonResp<DemoReq> getDemo(@PathVariable int id){
        System.out.println("the given id is :" + id);
        DemoReq demoReq = new DemoReq();
        demoReq.setId(id);
        demoReq.setAddress("Jiu long Road");
        demoReq.setName("weshzhu");
        return SingletonResp.success("get one", demoReq);
    }

    @PostMapping("/demo")
    @ApiOperation("新增Demo接口")
    public BaseResp addDemo(@RequestBody DemoReq deo){

        return BaseResp.success("add success");
    }

    @DeleteMapping("/demo/{id}")
    @ApiOperation("删除Demo接口")
    private BaseResp deleteDemo(@PathVariable int id){
        return BaseResp.success("delete ok");
    }

    @GetMapping("/route")
    private SingletonResp getRouteInfo(HttpServletRequest request){
        Map<String,String[]> params = request.getParameterMap();
        System.out.println(params.get("red"));
        System.out.println(params);
        Map<String, String> result = new HashMap<>();
        result.put("serverPort", serverProperties.getPort().toString());
        result.put("serverIP", serverProperties.getAddress().getHostAddress());

        return SingletonResp.success("route",result);
    }
}
