/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import td1.exo.Athlete;
import td1.exo.Participer;

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
        
        System.out.println("a1.get_first_name()"+a1.get_first_name()+" a1.get_family_name()"+a1.get_family_name());
        System.out.println("a2.get_first_name()"+a2.get_first_name()+" a2.get_family_name()"+a2.get_family_name());
        System.out.println("a3.get_first_name()"+a3.get_first_name()+" a3.get_family_name()"+a3.get_family_name());
        
        Participer p1=new Participer();
        Participer p2=new Participer();
        Participer p3=new Participer();
        
        p1.init(1,10);
        p2.init(3,9);
        p3.init(2,11);
        
        System.out.println("a1.get_no_runway()"+p1.get_no_runway()+" a1.get_time()"+p1.get_time());
        System.out.println("a2.get_no_runway()"+p2.get_no_runway()+" a2.get_time()"+p2.get_time());
        System.out.println("a3.get_no_runway()"+p3.get_no_runway()+" a3.get_time()"+p3.get_time());
        
        p3.set_time(8);
        System.out.println("a3.get_no_runway()"+p3.get_no_runway()+" a3.get_time()"+p3.get_time());
        
        
        
    }
    
}
