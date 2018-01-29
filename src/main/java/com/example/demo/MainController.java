package com.example.demo;

import jdk.nashorn.internal.ir.WhileNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@RestController
public class MainController {

     @RequestMapping("/")
    public String MainController(@RequestParam("userValue") int userValue) {

         //ArrayList <Integer> numbers =  new ArrayList <Integer>();
         int number = userValue;
         int num_1 = 1;
         int num_2 = 0;
         //int num_3 = 0;
         //int num_4 = 0;
         int NumberCheck=( (userValue-num_1) + ((userValue-num_1)- num_2) + ((userValue-num_1-num_2) )); //- num_3) + ((userValue-num_1-num_2-num_3) - num_4));

         for (int Number= userValue; userValue!= ( (userValue-num_1) + ( (userValue-num_1)- num_2) ); );  {

             num_2 += 1;



         }

         return " " + userValue;
     }


}
