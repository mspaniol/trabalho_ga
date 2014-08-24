/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidades.Aluno;
import trabalho_ga.AcessoBanco;

/**
 *
 * @author mozart
 */
public class AlunoController {
    
    public void cadastrarAluno(Aluno aluno) throws Exception{
        try {
            if(aluno.getNome().isEmpty()) {
                throw new Exception("Nome vazio");
            }
            else {
                String insert = "INSERT INTO Aluno (Nome) VALUES ('" + aluno.getNome() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
