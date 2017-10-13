package com.rocky.cloud.feign.hystrix;

import com.rocky.cloud.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Rocky on 2017-09-08.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello3(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
