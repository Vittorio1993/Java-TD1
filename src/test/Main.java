/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import td1.exo.Athlete;

/**
 *
 * @author zhanghuakai
 */

public class Main {
    public static void main(String[] args){
        Athlete a1=new Athlete();
        Athlete a2=new Athlete();
        Athlete a3=new Athlete(); 
        
        a1.init("Truc","Michel");
        a2.init("Tortillo","François");
        a3.init("Blabla","Déde");

        a1.afficher();
        a2.afficher();
        a3.afficher();
        
        System.out.println("a1.get_first_name()"+a1.get_first_name());
        System.out.println("a2.get_first_name()"+a2.get_first_name());
        System.out.println("a3.get_first_name()"+a3.get_first_name());
        
        
        
    }
    
}
