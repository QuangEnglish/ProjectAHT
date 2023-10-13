package com.quangenglish.testrestapiaht.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ErrorService {

    public ResponseEntity<String> getErrol(int id) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "https://8658-14-160-25-148.ngrok.io/exception",
                String.class
        );
        // Kiểm tra giá trị của ID và xử lý tương ứng
        switch (id) {
            case 1:
                // Xử lý lỗi cho ID 1
                return ResponseEntity.status(400).body("Error 1");
            case 2:
                // Xử lý lỗi cho ID 2
                return ResponseEntity.status(401).body("Error 2");
            case 3:
                // Xử lý lỗi cho ID 3
                return ResponseEntity.status(403).body("Error 3");
            default:
                // ID không hợp lệ, trả về lỗi mặc định
                return ResponseEntity.status(500).body("Invalid ID");
        }
    }
}
