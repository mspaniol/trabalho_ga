/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidades.Disciplina;
import trabalho_ga.AcessoBanco;

/**
 *
 * @author mozart
 */
public class DisciplinaController {
    
    public void cadastrarDisciplina(Disciplina d) throws Exception{
        try {
            if(d.getNome().isEmpty()) {
                throw new Exception("Nome vazio");
            }
            else {
                String insert = "insert into Disciplina (Nome) values ('" + d.getNome() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
