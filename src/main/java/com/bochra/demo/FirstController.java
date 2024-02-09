package com.bochra.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public  String sayHello(){
        return "say hello from Controller";
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/hello2")
    public  String sayHello2(){
        return "say hello2 from Controller";
    }

    @PostMapping("/post")
    public  String Post(@RequestBody String message){
        return "Request Accepted and message is : " + message;
    }

    @PostMapping("/post-order")
    public  String postOrder(@RequestBody Order order){
        return "Request Accepted and order is : " + order.toString();
    }

    @PostMapping("/post-order-record")
    public  String postRecord(@RequestBody OrderRecord order){
        return "Request Accepted and order is : " + order.toString();
    }

    @GetMapping("/hello2/{user-name}")
    public  String pathVar(
            @PathVariable("user-name") String userName
    ){
        return "my value = " + userName;
    }

    @GetMapping("/hi")
    public  String paramVar(
            @RequestParam("user-name") String userName,
            @RequestParam("user-lastname") String userlastName
    ){
        return "my value = " + userName + " " + userlastName;
    }



}
