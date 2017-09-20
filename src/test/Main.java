/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import td1.exo.Athlete;
import td1.exo.Participer;
import td1.exo.Course;

/**
 *
 * @author zhanghuakai
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Les informations des athlètes: ");
        
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
        
        System.out.println("\nLes informations des participations: ");
        
        p1.init(1,a1);
        p2.init(2, a3);
        p3.init(3,a2);
        
        p1.afficher();
        p2.afficher();
        p3.afficher();
        
        System.out.println("a1.get_no_runway()"+p1.get_no_runway()+" a1.get_time()"+p1.get_time());
        System.out.println("a2.get_no_runway()"+p2.get_no_runway()+" a2.get_time()"+p2.get_time());
        System.out.println("a3.get_no_runway()"+p3.get_no_runway()+" a3.get_time()"+p3.get_time());
        System.out.println("a3.get_no_runway()"+p3.get_no_runway()+" a3.get_time()"+p3.get_time());
        
  
        System.out.println("\nLes informations des courses: ");
        
        
        
        Course c1 = new Course();
        
        
        
        c1.init("100M");
        
        c1.affect(a3,1);
        c1.affect(a2,2);
        c1.affect(a1,3);
        
        c1.record(1,9);
        c1.record(2,10);
        c1.record(3,8);
        
        
        
        System.out.println("Le nom de course: "+c1.get_name());
        
        System.out.println("Le couloir no.1 est l'athlète: "+c1.get_athlete(1).get_first_name()+" "+c1.get_athlete(1).get_family_name());
        System.out.println("Le couloir no.2 est l'athlète: "+c1.get_athlete(2).get_first_name()+" "+c1.get_athlete(2).get_family_name());
        System.out.println("Le couloir no.3 est l'athlète: "+c1.get_athlete(3).get_first_name()+" "+c1.get_athlete(3).get_family_name());
        System.out.println("Le vainqueur est "+c1.get_winer().get_first_name()+" "+c1.get_winer().get_family_name());
     
             
    }
    
}