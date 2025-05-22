/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal3;
class Animal3{
    void walk(){System.out.println("walks");}
     
}
class Bird extends Animal3{
     void fly(){System.out.println("flies");}
    
}

public class Main{

    public static void main(String[] args) {
        Bird b=new Bird();
        b.walk();
        b.fly();
        System.out.println(b);   

        
    }
    
}
