/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massiv_1;

/**
 *
 * @author Acpar
 */
public class Massiv_1 {

    /**
     * @param args the command line arguments
     */
    public static void mas(){
        int [] m = {5,0,2,0,4};  
        for (int i=0; i<m.length-1; i++){
           
            if (m[i]==0){
                System.out.println(m[i]);
            }
        
    }
        
    
    }
    
    public static void mas2(){
        int []m2 = new int[10];
        int i=0;
        int b=2;
        while (i<10){
            m2[i]=b;
            b+=2;
            i++;
        }
        for (int j=0; j<m2.length;j++){
            System.out.print(m2[j]+ " ");
        }
        for (int j=0;j<m2.length;j++){
            System.out.println();
            System.out.println(m2[j]);
        }
        
        
    }
    
    public static void mas2_1 (){
        
        int mas[] = new int[20/2];
        
        for (int i=0, j=2; i<mas.length;i++,j+=2){
        mas[i]=j;
            System.out.print(mas[i] + " ");
            
    }
        for (int i=0;i<mas.length;i++){
            System.out.println("\n" + mas[i]);
        }
    } 
    
    public static void mas2_2(){
        
        int a=0;
        for (int i=1; i<=99; i++){
            if(i%2!=0) a++;
        }
        int[]mas= new int[a];
        
        for (int i=1,b=0;i<=99;i++){
            if (i%2!=0){
                mas[b]=i;
                System.out.print(mas[b]+" ");
                b++;
                        }
        }
        System.out.println("");
        for (int i=mas.length-1; i>=0;i--){
            System.out.print(mas[i]+  " ");
        }
    }
            
            
        public static void main(String[] args) {
        // TODO code application logic here
      mas2_2();
        
    }

    
    
    
    
}
