/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarvis;

/**
 *
 * @author Matias
 */
public class Bota {
 private boolean Roto=false;
 private int consumo=2;
 private int salud=100;
 
 
    public Bota() {
    }

    public boolean isRoto() {
        return Roto;
    }

    public void setRoto(boolean Roto) {
        this.Roto = Roto;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    
    
}
