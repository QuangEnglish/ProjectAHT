package com.quangenglish.testrestapiaht.controller;

import com.quangenglish.testrestapiaht.service.ErrorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ErrorController {
    private final ErrorService errorService;

    @GetMapping("/getErrol")
    public void getErrolController(@RequestParam("id") Integer id){
        errorService.getErrol(id);
    }
}
