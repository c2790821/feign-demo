package com.example.main;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hello-service", url = "localhost:8081/hello")
public interface HelloService {
    @GetMapping("/{name}")
    String greeting(@PathVariable String name);
}
