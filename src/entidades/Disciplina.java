/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. teste mozart
 */

package entidades;

/**
 *
 * @author mozart
 */
public class Disciplina {
    
    // atributos
    private String nome;

    // construtor
    public Disciplina(String nome){
        this.nome = nome;
    }
    
    // gets e sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
