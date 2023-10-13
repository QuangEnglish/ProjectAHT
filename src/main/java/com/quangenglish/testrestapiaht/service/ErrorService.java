package com.quangenglish.testrestapiaht.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ErrorService {

    public ResponseEntity<String> getErrol(int id){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json");

        HttpEntity httpEntity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "https://8658-14-160-25-148.ngrok.io/exception",
                HttpMethod.GET,
                httpEntity,
                String.class
        );
        int code;
        if(id== 1){
            code = 400;
        }else if(id==2){
            code = 401;
        }else if(id==3){
            code = 403;
        }else{
            code = 500;
        }

        return ResponseEntity.status(code).body("");
    }
}
