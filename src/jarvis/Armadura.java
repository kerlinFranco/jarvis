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

    static Scanner leer = new Scanner(System.in);
    static Random ram = new Random();
    private int salud = 100;
    private Bota[] botas = new Bota[2];
    private Guante[] guantes = new Guante[2];
    private double Bateria = 100;

    public Armadura() {
        Bota b1 = new Bota();
        Bota b2 = new Bota();
        Guante g1 = new Guante();
        Guante g2 = new Guante();
        botas = new Bota[]{b1, b2};
        guantes = new Guante[]{g1, g2};

    }

    public void caminar() {
        System.out.println("Cuantos pasos desea caminar");
        int pasos = leer.nextInt();
        if (Bateria >= pasos && botas[0].isRoto() == false && botas[1].isRoto() == false) {
            for (int i = 0; i <= pasos; i++) {
                Bateria -= botas[0].getConsumo();
                botas[0].setSalud(botas[0].getSalud() - 1);
                botas[1].setSalud(botas[1].getSalud() - 1);
                if (botas[0].getSalud() == 0 || botas[1].getSalud() == 0) {
                    botas[0].setRoto(true);
                    botas[1].setRoto(true);
                    break;
                }
                System.out.println("pasos" + i);
                if (i % 10 == 0 && i != 0) {
                    int num = ram.nextInt(10);
                    if (num == 1 || num == 2 || num == 0) {
                        botas[ram.nextInt(2)].setRoto(true);
                        System.out.println("La se rompio una bota");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Bateria insuficiente");
        }

    }

    public void correr() {
        System.out.println("Cuantos pasos desea correr");
        int pasos = leer.nextInt();
        if (Bateria >= pasos && botas[0].isRoto() == false && botas[1].isRoto() == false) {
            for (int i = 0; i <= pasos; i++) {
                Bateria -= botas[0].getConsumo() * 2;
                botas[0].setSalud(botas[0].getSalud() - 2);
                botas[1].setSalud(botas[1].getSalud() - 2);
                if (botas[0].getSalud() == 0 || botas[1].getSalud() == 0) {
                    botas[0].setRoto(true);
                    botas[1].setRoto(true);
                    break;
                }
                System.out.println("pasos" + i);
                if (i % 10 == 0 && i != 0) {
                    int num = ram.nextInt(10);
                    if (num == 1 || num == 2 || num == 0) {
                        botas[ram.nextInt(2)].setRoto(true);
                        System.out.println("La se rompio una bota");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Bateria insuficiente");
        }
    }

    public void propulsar() {
        System.out.println("Cuanto metros desea propulsarse");
        int metros = leer.nextInt();
        if (Bateria >= metros && botas[0].isRoto() == false && botas[1].isRoto() == false) {
            for (int i = 0; i <= metros; i++) {
                Bateria -= botas[0].getConsumo() * 3;
                botas[0].setSalud(botas[0].getSalud() - 3);
                botas[1].setSalud(botas[1].getSalud() - 3);
                if (botas[0].getSalud() == 0 || botas[1].getSalud() == 0) {
                    botas[0].setRoto(true);
                    botas[1].setRoto(true);
                    break;
                }
                System.out.println("metros" + i);
                if (i % 10 == 0 && i != 0) {
                    int num = ram.nextInt(10);
                    if (num == 1 || num == 2 || num == 0) {
                        botas[ram.nextInt(2)].setRoto(true);
                        System.out.println("La se rompio una bota");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Bateria insuficiente");
        }
    }

    public void volar() {
        System.out.println("Cuanto metros desea volar");
        int metros = leer.nextInt();
        if (Bateria >= metros && botas[0].isRoto() == false && botas[1].isRoto() == false
                &&guantes[0].isRoto() == false && guantes[1].isRoto() == false) {
            for (int i = 0; i <= metros; i++) {
                Bateria -= (botas[0].getConsumo() * 3)+(guantes[0].getConsumo()*2);
                botas[0].setSalud(botas[0].getSalud() - 3);
                botas[1].setSalud(botas[1].getSalud() - 3);
                guantes[0].setSalud(guantes[0].getSalud() - 2);
                guantes[1].setSalud(guantes[1].getSalud() - 2);
                
                if (botas[0].getSalud() == 0 || botas[1].getSalud() == 0) {
                    botas[0].setRoto(true);
                    botas[1].setRoto(true);
                    break;
                }
                
                if (guantes[0].getSalud() == 0 || guantes[1].getSalud() == 0) {
                    guantes[0].setRoto(true);
                    guantes[1].setRoto(true);
                    break;
                }
                
                System.out.println("metros" + i);
                if (i % 10 == 0 && i != 0) {
                    int num = ram.nextInt(10);
                    int num2 = ram.nextInt(10);
                    
                    if (num == 1 || num == 2 || num == 0) {
                        botas[ram.nextInt(2)].setRoto(true);
                        System.out.println("La se rompio una bota");
                        break;
                    }
                    if (num2 == 1 || num2 == 2 || num2 == 0) {
                        guantes[ram.nextInt(2)].setRoto(true);
                        System.out.println("La se rompio un guante");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Bateria insuficiente");
        }
    }
     
    public void disparar(){
        if(Bateria>(guantes[0].getConsumo())*3){
            System.out.println("Disparaste");
            Bateria-=(guantes[0].getConsumo())*3;
        }
    }

}
