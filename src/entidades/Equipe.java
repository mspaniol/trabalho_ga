/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class Equipe {

    // atributos
    private int equipeID;
    private String nome;

    // construtor
    public Equipe(String nome) {
        this.nome = nome;
    }

    public Equipe() {
    }

    // gets e sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEquipeID(int equipeID) {
        this.equipeID = equipeID;
    }

    public int getEquipeID() {
        return equipeID;
    }

    public static List getEquipes() throws Exception {
        try {
            ArrayList list = new ArrayList();

            entidades.Equipe equipe = new entidades.Equipe();
            equipe.setEquipeID(new Integer(1));
            equipe.setNome("Fornecedor 1");
            list.add(equipe);

            equipe = new entidades.Equipe();
            equipe.setEquipeID(new Integer(2));
            equipe.setNome("Fornecedor 2");
            list.add(equipe);

            equipe = new entidades.Equipe();
            equipe.setEquipeID(new Integer(3));
            equipe.setNome("Fornecedor 3");
            list.add(equipe);

            return list;
//            String insert = "INSERT INTO Equipe (Nome) VALUES ('" + equipe.getNome() + "')";

//            AcessoBanco bd = new AcessoBanco();
//            bd.executar(insert);
        } catch (Exception e) {
            return null;
        }
    }
}
