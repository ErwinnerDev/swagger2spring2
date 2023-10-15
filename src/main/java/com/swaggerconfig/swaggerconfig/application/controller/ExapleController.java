package com.swaggerconfig.swaggerconfig.application.controller;

import com.swaggerconfig.swaggerconfig.model.ExampleResponse;
import com.swaggerconfig.swaggerconfig.application.resources.Exampleresource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExapleController implements Exampleresource {
    @Override
    public ResponseEntity<ExampleResponse> saludar(String name) {
        ExampleResponse response = new ExampleResponse();
        response.setStatus("OK");
        response.setSaludo("Holaa "+name+"!!");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
