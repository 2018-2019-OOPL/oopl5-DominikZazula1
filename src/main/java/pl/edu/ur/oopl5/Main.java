package pl.edu.ur.oopl5;

import pl.edu.ur.oopl5.companyAndEmployees.company.Company;
import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;
import pl.edu.ur.oopl5.stack.Stack;

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
//        Book b=new Book("Pan Lodowego Ogrodu - tom I","Jaros³aw Grzêdowicz",560,2012,24.43);
//        System.out.println(b.getT());
//        System.out.println(b.getA());
//        System.out.println(b.getP());
//        System.out.println(b.getY());
//        b.set(30.01);
//        System.out.println(b.get());
//        Stack s=new Stack(2);
//     System.out.println(s.pop());
//        s.push(1);
//        s.push(2);
//        s.push(3);
//          MyDate time=new MyDate();
//          time.plus();
//          time.minus();
 Employee employee = new Employee("Adam", "Nowak", 24,"Junior SocialMedia Specialist");
        Employee employee1 = new Employee("Jan", "Kowalski", 45, "Manager");
        Company company = new Company(7);

        company.addEmployee(employee);
        company.addEmployee(employee1);

        Employee[] employees = company.getEmployees();

        System.out.println(employees[0].getName());
        System.out.println(employees[0].getSurname());
        System.out.println(employees[0].getAge());
        System.out.println(employees[0].getPosition());
        System.out.println(employees[1].getName());
        System.out.println(employees[1].getSurname());
        System.out.println(employees[1].getAge());
        System.out.println(employees[1].getPosition());
        
      
        
       
    }

}
