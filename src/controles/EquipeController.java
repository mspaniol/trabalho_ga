/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidades.Equipe;
import trabalho_ga.AcessoBanco;

/**
 *
 * @author Jonathan
 */
public class EquipeController {
    public void cadastrarEquipe(Equipe equipe) throws Exception{
        try {
            if(equipe.getNome().isEmpty()) {
                throw new Exception("Nome vazio");
            }
            else {
                String insert = "INSERT INTO Equipe (Nome) VALUES ('" + equipe.getNome() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
