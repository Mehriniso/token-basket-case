package com.example.demo.service;

import com.example.demo.model.BodyMessage;
import com.example.demo.model.Item;
import com.example.demo.model.Response;
import com.example.demo.restclient.InstantOrderRestClient;
import com.example.demo.utilities.ProjectConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

@Service
public class OrderCoffee
{
    public static Integer incrementBy = 10;

    public Response  instantOrder(List<Item> pItems)
    {
        Response response = new Response();
        BodyMessage bodyMessage = setBodyMessage(pItems);
        ResponseEntity<String> responseEntity = postRequestInstantOrder(bodyMessage);
        if(responseEntity!=null)
        {
            HttpStatus httpStatus = responseEntity.getStatusCode();
            response.setStatus(httpStatus.getReasonPhrase());
            response.setData(responseEntity.getBody());
            response.setStatusCode(responseEntity.getStatusCodeValue());
        }
        return response;
    }

    public ResponseEntity<String> postRequestInstantOrder(BodyMessage bodyMessage)
    {
        InstantOrderRestClient restClient = new InstantOrderRestClient();
        ResponseEntity<String> responseEntity = null;
        try {
            responseEntity =  restClient.postInstnatOrder(bodyMessage);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return responseEntity;
    }



    public BodyMessage setBodyMessage(List<Item> pItems)
    {
        BodyMessage bodyMessage = new BodyMessage();
        bodyMessage.setItems(pItems);
        bodyMessage.setTerminalid(ProjectConstants.TERMINAL_ID);
        bodyMessage.setId(String.valueOf(getId()));
        return  bodyMessage;
    }

    public  Integer getId()  {

      return  ( int) (new Date().getTime()/1000);

    }

}
