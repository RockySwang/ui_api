package com.example.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by swang on 7/16/2018.
 */
//@RestController=@Controller+@ResponseBody, return not view but the response body of json/xml/custom mediaType.
//@RestController
@Controller
//@RequestMapping("/heartbeat")
@GetMapping("/heartbeat")
public class HeartbeatController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Heartbeat getHeartbeat() {
        return new Heartbeat();
    }
}
