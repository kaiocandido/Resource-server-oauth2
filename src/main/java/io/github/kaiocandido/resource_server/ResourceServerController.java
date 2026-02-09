package io.github.kaiocandido.resource_server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceServerController {

    @GetMapping("/pulbic")
    public ResponseEntity<String> publicEndPoint(){
        return  ResponseEntity.ok("PUBLICO ENDPOINT OK");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateEndPoint(){
        return  ResponseEntity.ok("PRIVATE ENDPOINT OK");
    }
}
