/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USURIO
 */
public class Armadura {
    static Scanner leer=new Scanner(System.in);
    static Random ram=new Random();
    private int salud=100;
    private Bota[] botas=new Bota[2];
    private Guante[] guantes=new Guante[2];
    private double Bateria=100;

    public Armadura() {
        Bota b1=new Bota();
        Bota b2=new Bota();
        botas=new Bota[]{b1,b2};
        
    }
    
    
    public void caminar(){
        System.out.println("Cuantos pasos desea caminar");
        int pasos=leer.nextInt();
       if(Bateria>=pasos && botas[0].isRoto()==false && botas[1].isRoto()==false){
          for (int i=0; i<= pasos; i++) {
            Bateria--;
          if(i%10==0){
              int num=ram.nextInt(10);
              if(num==1||num==2||num==0){
                  botas[ram.nextInt(2)].setRoto(true);
                  System.out.println("La se rompio una bota");
                  break;
              }
          }  
        } 
       }else{
           System.out.println("Bateria insuficiente");
       }
        
        
    }
}
