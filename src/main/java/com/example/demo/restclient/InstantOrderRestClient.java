package com.example.demo.restclient;

import com.example.demo.model.BodyMessage;
import com.example.demo.utilities.ProjectConstants;
import com.example.demo.utilities.RestTemplateUtil;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class InstantOrderRestClient
{

    public ResponseEntity<String> postInstnatOrder(BodyMessage requestBody) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {

        RestTemplate restTemplate = RestTemplateUtil.getRestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("x-ibm-client-id", ProjectConstants.CLIENT_ID);
        httpHeaders.set("x-ibm-client-secret", ProjectConstants.CLIENT_SECRET_KEY);
        HttpEntity<BodyMessage> entity = new HttpEntity<>(requestBody,httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange("https://sandbox-api.payosy.com/api/instantorder", HttpMethod.POST, entity, String.class);
        return responseEntity;
    }
}
