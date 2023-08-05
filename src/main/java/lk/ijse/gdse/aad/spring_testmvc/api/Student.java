package lk.ijse.gdse.aad.spring_testmvc.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class Student {
    @GetMapping("student/{id:S\\d{3}}")
    public String getStudentDetails(@PathVariable String id){
        return "Get student data of "+id;
    }
    @GetMapping("student")
    public String getAllStudent(){
        return "Get all student data ";
    }

    @GetMapping("student/{id}*")
    public String getAllStudentAllDetails(@PathVariable String id){
        return "Get all student all details"+id;
    }
    @GetMapping("student/{id}/{code}")
    public String getAllStudentWithTwoParams(@PathVariable String id, @PathVariable int code){
        return "Get all student data with two params "+id+ " and " +code;
    }
}
