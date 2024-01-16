package com.example.java4.controllers;
import com.example.java4.dto.mau_sac.StoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    //    @RequestMapping(name="login", method = RequestMethod.POST)
    @Autowired
    @Qualifier("white")
    private StoreRequest req;
    @RequestMapping("hello")
    public String hello()
    {
        System.out.println(req.getId());
        System.out.println(req.getMa());
        System.out.println(req.getTen());
        return "index";
    }
}