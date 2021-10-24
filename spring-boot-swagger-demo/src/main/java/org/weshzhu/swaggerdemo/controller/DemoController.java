package org.weshzhu.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.demonzsd.common.api.response.BaseResp;
import org.demonzsd.common.api.response.SingletonResp;
import org.springframework.web.bind.annotation.*;
import org.weshzhu.swaggerdemo.controller.requests.DemoReq;

/**
 * Demo controller
 * @author zsd
 */
@RestController
@Api(tags = "Demo 管理功能")
public class DemoController {
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
    private BaseResp getRouteInfo(){
        return BaseResp.success("route");
    }
}
