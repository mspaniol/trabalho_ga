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
public class Aluno {

    // atributos
    private String alunoID;
    private String nome;

    // construtor
    public Aluno(String nome) {
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
