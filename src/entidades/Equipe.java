/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jonathan
 */
public class Equipe {

    // atributos
    private String EquipeID;
    private String nome;

    // construtor
    public Equipe(String nome) {
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
