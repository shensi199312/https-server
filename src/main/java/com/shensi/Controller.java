package com.shensi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("test")
    @ResponseBody
    public String test(HttpServletRequest httpServletRequest){
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        List<String> headers = new ArrayList<>();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            headers.add(s + ":" + httpServletRequest.getHeader(s));
        }
        return String.join("\n", headers);
    }
}
