package com.example.user.User.Service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TestService")
public interface TestServiceClient {
    @GetMapping("/api/v1/test/hello")
    String getHelloFromTestService();
}
