package com.example.Gestion2.controller;

import com.example.Gestion2.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @Autowired
  HomeService homeService;
  @RequestMapping("/p1")
    String f1()
    { return homeService.m1();  }
  @RequestMapping("/p2")
  String f2()
  { return homeService.m2();  }
}
