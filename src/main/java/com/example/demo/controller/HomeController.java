package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.model.Response;
import com.example.demo.service.OrderCoffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController
{
    @Autowired
    OrderCoffee orderCoffeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @PostMapping("/post/instant/order")
    public @ResponseBody  Response instantOrder(@RequestBody List<Item> items)
    {
        Response response = orderCoffeeService.instantOrder(items);
        return response;
    }

}
