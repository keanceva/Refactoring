/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

/**
 *
 * @author CltControl
 */
public class Carro {
    private int gasolina;
    private int acelaracionMax;
    private String estado;
    public boolean encender(){
        if(estado.equals("on")){
            return true;
        }
        return false;
    }
    public int getGasolina(){
        return this.gasolina;
    }
    public int getAcelaracionMax(){
        return this.acelaracionMax;
    }
}
