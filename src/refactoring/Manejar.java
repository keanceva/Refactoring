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
public class Manejar {
    Carro c=new Carro();
    int combustible= c.getGasolina();
    int velocidadMax= c.getAcelaracionMax();
    public String datosCarro(){
        return "El carro tiene una capacidad de combustible de" + combustible+"y una acelarión máxima de"+ velocidadMax;
    }
}
