package com.learn.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirtsController {

    @GetMapping("hey")
    public String hey() {
        return "Hey from contoller";
    }

    @PostMapping("post-order")
    public String postText(@RequestBody OrderDTO data) {
        return data.toString();
    }

    @PostMapping("post-order-record")
    public String postTextRecord(@RequestBody OrderRecord data) {
        return data.toString();
    }

    @GetMapping("/hey/{user-name}")
    public String heyBro(@PathVariable("user-name") String userName) {
        return "Hey " + userName;
    }

}
