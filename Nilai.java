/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8_1;

/**
 *
 * @author Deltaviyahya
 */
public class Nilai implements D1,I1{
    
    boolean nilai;
   
    public Nilai (Double n){
        nilai = n%1==0;
        cekvalue();
    }
    public void cekvalue(){
        if(nilai){
            I1();
        }
        else{
            D1();
        }
    }
     public void I1(){
         System.out.println("Integer");
         System.out.println("----------------------");
     }
     public void D1(){
         System.out.println("Double");
         System.out.println("----------------------");
     }
      
}
 
