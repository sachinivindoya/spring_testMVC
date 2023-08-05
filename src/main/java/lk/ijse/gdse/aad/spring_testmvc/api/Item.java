package lk.ijse.gdse.aad.spring_testmvc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/item")
@RestController
public class Item {


    @GetMapping(params = "data")
    public String getItemsWithParams(String data){
        return "get item" +data;
    }

    @GetMapping(headers = "X-token")
    public  String setItemWithCustomerToken(@RequestHeader("X-token") String token){
        return "Saved the item as : " +token;
    }

}
