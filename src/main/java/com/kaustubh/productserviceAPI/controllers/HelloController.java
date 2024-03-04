package com.kaustubh.productserviceAPI.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//This Class will be serving rest API's (HTTP API'S)
@RequestMapping("/hello")
// This Class will be serving on localhost:8080/hello
public class HelloController {

    // /hello/say/name/times
    @GetMapping("/say/{name}/{times}")
    public String  sayHello(@PathVariable ("name") String name,
                            @PathVariable("times") int times){

        String answer ="";
        for (int i =0 ;i< times;i++){
            answer += "Hello "+name;
            answer+="<br>";
        }


        return answer;
    }
}
