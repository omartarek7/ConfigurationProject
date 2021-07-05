package com.example.ConfigurationProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfigurationController {

@RequestMapping("/")
public String index(){

    return "index.html";
}

@RequestMapping(value = "/saveConfig",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute Configuration configuration){


    ModelAndView modelAndView =new ModelAndView();
    modelAndView.setViewName("config_info");
    modelAndView.addObject("Configuration" ,configuration);
    return modelAndView;
}

}
