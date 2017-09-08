package com.rocky.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Rocky on 2017-09-08.
 */
@FeignClient(name= "microservice-provider")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
