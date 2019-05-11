/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.time.LocalDate;

/**
 *
 * @author Dominik
 */
public class MyDate {
    private LocalDate now = LocalDate.now();
    MyDate(){
        System.out.println(now);
}
    void plus(){
      now=now.plusDays(7);
      System.out.println(now);
    }
    void minus(){
       now=now.minusDays(7);
       System.out.println(now); 
    }
}

