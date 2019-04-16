/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Dominik
 */
public class Book {
   private String title;
   private String author;
   private int pages;
   private int year;
   private double price;
   Book(String title,String author,int pages,int year){
       this.title=title;
       this.author=author;
       this.pages=pages;
       this.year=year;
    }
   Book(String title,String author,int pages,int year,double price){
       this.title=title;
       this.author=author;
       this.pages=pages;
       this.year=year;
       this.price=price;
    }
   String getT(){
       return title;
   }
   String getA(){
       return author;
   }
   int getP(){
       return pages;
   }
   int getY(){
       return year;
   }
   double get(){
       return price;
   }
   void set(double price){
       this.price=price;
   }
}
