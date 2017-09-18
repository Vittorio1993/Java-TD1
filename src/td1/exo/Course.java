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
    private Athlete ath;
    ArrayList<Participer> lstparticipant;
    
    public void init(){
       
    lstparticipant = new ArrayList<>();
    }
            
    
    
    public String get_name(){
        return name;
    }
    public void affect(Athlete a, int c){
       
    }
    public void record(int c, int t){
        
    }
    public Athlete get_athlete(int c){
       return ath ; 
    }
    public Athlete get_winer(){
        return ath ; 
    }
}
