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
public class Athlete {
    private String family_name;
    private String first_name;
    
    public void init(String n, String p){
        family_name=n;
        first_name=p;
    }
    public String get_family_name(){
        return family_name;
    }
    
    public String get_first_name(){
        return first_name;
    }
    
    public void afficher(){
       String test="Athlète "+family_name+","+first_name;
       System.out.println(test);
    }
}
