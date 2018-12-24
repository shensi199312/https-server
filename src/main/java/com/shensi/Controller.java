package com.shensi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("test")
    @ResponseBody
    public String test(HttpServletRequest httpServletRequest){
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s + ":" + httpServletRequest.getHeader(s));
        }
        return "hello world!";
    }
}
