/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidades.Turma;
import trabalho_ga.AcessoBanco;

/**
 *
 * @author mozart
 */
public class TurmaController {
    
    public void cadastrarTurma(Turma t) throws Exception{
        try {
            if(t.getSemestre().isEmpty()) {
                throw new Exception("Semestre vazio");
            }
            else {
                String insert = "insert into Turma (DisciplinaID, Semestre) values (" + t.getDisciplinaId() + ", '" + t.getSemestre() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
