/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;
import java.util.Scanner;

public class CarTester 
{    
    public static void main(String[] args) 
    {
        Car car1 = new Car();
        Car car2 = new Car("Mazda", "3", 2016, 15000, 2, 1);
        Car car3 = new Car("Toyota", "Prius", 2015, 20000);
        
        System.out.println(car1);
        System.out.println("----------");
        System.out.println(car2);
        System.out.println("----------");
        System.out.println(car2);
        System.out.println("----------");
        
        car1.honkHorn();
        car3.honkHorn();
        
        
    }
}