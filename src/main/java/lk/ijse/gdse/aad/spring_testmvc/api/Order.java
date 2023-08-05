package lk.ijse.gdse.aad.spring_testmvc.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")

public class Order {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveOrderJSON(){
        return "save order JSON";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String saveOrderXML(){
        return "Saved order XML";
    }
}
