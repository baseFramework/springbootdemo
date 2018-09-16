package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value= {"/say","/hi"}, method= RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }


    @RequestMapping(value="/list/{id}" , method = RequestMethod.GET)
    public String list(@PathVariable("id") Integer id){
        return "id: " + id;
    }

    //@RequestMapping(value="/name" , method = RequestMethod.GET)
    @GetMapping(value="/name" )
    public String name(@RequestParam(value = "id",required = true, defaultValue = "0") Integer id){
        return "id: " + id;
    }

}
