package lk.ijse.gdse.aad.spring_testmvc.api;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/item")
@RestController
public class Item {


    @GetMapping(params = "data")
    public String getItemsWithParams(String data){
        return "get item " +data;
    }

    @PostMapping(headers = "X-token")
    public  String setItemWithCustomerToken(@RequestHeader("X-token") String token){
        System.out.println("get itam");
        return "Saved the item as : " +token;
    }

    @PostMapping(value = "/{code}",headers = "X-token")
    public  String setItemWithCustomerTokenAndValue(@RequestHeader("X-token") String token, @PathVariable String code){
        return "Saved the item as : "+token+ " and "+code;
    }
}
