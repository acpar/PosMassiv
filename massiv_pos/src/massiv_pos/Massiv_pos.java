/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massiv_pos;

/**
 *
 * @author Acpar
 */
public class Massiv_pos {

    /**
     * @param args the command line arguments
     */
    
    public static void mas_pos(){
        String[] where= {"A","C","B","C","D","E","C"};
        String [] what = {"C","D"};
        for (int i=0;i<what.length;i++){
            for (int j=0;j<where.length;j++){
                if (what[i]==where[j]){
                 System.out.println(j); 
                    break;
                            
                }
                
            }
        }
    }
    
        public static void mas_pos2(){
        String[] where= {"A","B","C","D","E","C"};
        String [] what = {"C","D"};
        for (int i=0;i<where.length;i++){
            for (int j=0;j<what.length;j++){
                if (where[i]==what[j]){
                 System.out.println(i); 
                    
                            
                }
                
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        mas_pos();
    }
    
}
