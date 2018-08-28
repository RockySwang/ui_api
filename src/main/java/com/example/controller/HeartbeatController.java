package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by swang on 7/16/2018.
 */
//@RestController=@Controller+@ResponseBody, return not view but the response body of json/xml/custom mediaType.
@RestController
@RequestMapping("/heartbeat")
public class HeartbeatController {

	//https://gitee.com/mkk/HeartBeat/blob/V-2.0.0/pom.xml
    /*@RequestMapping(value = "", method = RequestMethod.GET)
    public Heartbeat getHeartbeat() {
        return new Heartbeat();
    }*/
}
