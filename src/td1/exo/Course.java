/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1.exo;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Course {
    private String name;
    private Integer nbrunway;
    private Athlete ath;
    ArrayList<Participer> lstparticipant;
    
    public void init(String n){
        lstparticipant = new ArrayList<>();    
        
        
    }
            
    
    
    public String get_name(){
        return name;
    }
    
    public Integer get_nbrunway(){
        return nbrunway;
    }
    
    public void affect(Athlete a, Integer c){
        Participer p=new Participer();
        p.init(c,a);
        lstparticipant.add(p);
    }       
    
        
    public void record(int c, int t){
        for(int i=0;i<=lstparticipant.size()-1;i++){
            if( lstparticipant.get(i).get_no_runway()==c ){
                lstparticipant.get(i).set_time(t);
           }
        }  
    }
    
    
    public Athlete get_athlete(int c){
        Athlete a=new Athlete();
        for(int i=0;i<=lstparticipant.size()-1;i++){
            if( lstparticipant.get(i).get_no_runway()==c ){
                a= lstparticipant.get(i).athelete;
            }
        }
         return a;
    }
         
    public Athlete get_winer(){
        Integer winertime;
        Athlete winer=new Athlete();
        winer=lstparticipant.get(0).get_athelete();
        winertime = lstparticipant.get(0).get_time(); 
        for(int i=0;i<=lstparticipant.size()-1;i++){
            if( lstparticipant.get(i).get_time()<winertime){
                winer=lstparticipant.get(i).get_athelete();
            }
            return winer; 
        }
        
        
        
        
        return ath ; 
    }
}
