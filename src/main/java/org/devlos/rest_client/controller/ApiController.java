package org.devlos.rest_client.controller;

import org.devlos.rest_client.dto.Req;
import org.devlos.rest_client.dto.UserResponse;
import org.devlos.rest_client.service.RestTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {
    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
    public Req<UserResponse> getHello(){
//        restTemplateService.post();
//        restTemplateService.exchange();
//        return new UserResponse();
//        return restTemplateService.hello();

        return restTemplateService.genericExchange();
    }
}
