/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidadesBD.Equipealuno;
import trabalho_ga.AcessoBanco;
/**
 *
 * @author Jonathan
 */
public class EquipeAlunoController {
    public void cadastrarEquipeAluno(Equipealuno equipeAluno) throws Exception{
        try {
            if(equipeAluno.getAlunoID() == null || equipeAluno.getEquipeID() == null) {
                throw new Exception("Dados incorretos");
            }
            else {
                String insert = "INSERT INTO EquipeAluno (EquipeID, AlunoID) VALUES (" + 
                        equipeAluno.getEquipeID().getEquipeID() + ", '" + 
                        equipeAluno.getAlunoID().getAlunoID() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
