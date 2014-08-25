/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. teste mozart
 */

package entidades;

/**
 *
 * @author Jonathan
 */
public class EquipeAluno {
    
    // atributos
    private int equipeAlunoID;
    private int equipeID;
    private int alunoID;

    // construtor
    public EquipeAluno(int equipeID, int alunoID){
        this.equipeID = equipeID;
        this.alunoID = alunoID;
    }
}
