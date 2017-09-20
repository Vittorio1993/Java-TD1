/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1.exo;

/**
 *
 * @author zhanghuakai
 */
public class Participer {
    private int no_runway;
    private Integer time;
    Athlete athelete;
    
    
    public void init(int n , Athlete athlete){
        this.no_runway=n;
        this.athelete=athlete;
        this.time= null;
    }
    
    public int get_no_runway(){
        return no_runway;
    }  
    public Integer get_time(){
        return time;
    }
    
    public Athlete get_athelete(){
        return athelete;
    }
    
    public void set_time(int t){
        this.time=t;
    
    }
    
    public void set_runway(int t){
        this.no_runway=t;
    
    }
    
    public void afficher(){
        System.out.println("Paritciper:");
        System.out.print("\t");
        get_athelete().afficher();
        System.out.println("\tsur le couloir "+get_no_runway());
        if (get_time()!=null){
            System.out.println("\ta réalisé le temps de "+get_time());
        }else{
            System.out.println("\tn'a pas encore couru");
        }
        
        
        
        
        
        
        
        
        
        
    }

    
    
}
