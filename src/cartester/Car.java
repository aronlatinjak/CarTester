/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

public class Car 
{
    private String makeName, modelName;
    private int year;
    private double price, length, width;
    
    public Car()
    {
        makeName = "Ford";
        modelName = "Fusion";
        year = 2013;
        price = 20000;
        length = 2.0;
        width = 1.0;
    } 
    public Car(String mkName, String mdName, int yr, double pr, double leng, double wid) 
    {
        makeName = mkName;
        modelName = mdName;
        year = yr;
        price = pr;
        length = leng;
        width = wid;
    }
    public Car(String mkName, String mdName, int yr, double pr)
    {
        makeName = mkName;
        modelName = mdName;
        year = yr;
        price = pr;
        length = (Math.random() * 10) + 1;
        width = (Math.random() * 5) + 1; 
    }
    public void honkHorn()
    {
        System.out.println("HONK HONK!");
    }
    public String toString() 
    {
         String output = "Make: " + makeName + "\n";
         output += "Model: " + modelName + "\n";
         output += "Year: " + year + "\n";
         output += "Price: $" + price + "\n";
         output += "Length: " + length + "m\n";
         output += "Width: " + length + "m\n";
         return output;
    }
}