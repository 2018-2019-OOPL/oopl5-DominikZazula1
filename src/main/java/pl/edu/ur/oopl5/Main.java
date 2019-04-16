package pl.edu.ur.oopl5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Book b=new Book("Pan Lodowego Ogrodu - tom I","Jaros³aw Grzêdowicz",560,2012,24.43);
        System.out.println(b.getT());
        System.out.println(b.getA());
        System.out.println(b.getP());
        System.out.println(b.getY());
        b.set(30.01);
        System.out.println(b.get());
       
    }

}
