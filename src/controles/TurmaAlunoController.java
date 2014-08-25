/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidadesBD.Turmaaluno;
import trabalho_ga.AcessoBanco;
/**
 *
 * @author mozart
 */
public class TurmaAlunoController {
    public void cadastrarTurmaAluno(Turmaaluno t) throws Exception{
        try {
            if(t.getAlunoID() == null || t.getTurmaID() == null) {
                throw new Exception("Dados incorretos");
            }
            else {
                String insert = "insert into TurmaAluno (TurmaID, AlunoID) values (" + t.getTurmaID().getTurmaID() + ", '" + t.getAlunoID().getAlunoID() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
