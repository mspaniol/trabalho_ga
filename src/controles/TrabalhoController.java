/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

import entidadesBD.Trabalho;
import trabalho_ga.AcessoBanco;

/**
 *
 * @author mozart
 */
public class TrabalhoController {
    public void cadastrarTrabalho(Trabalho t) throws Exception{
        try {
            if(t.getTitulo().isEmpty() || t.getDescricao().isEmpty() || t.getDisciplinaID() == null || t.getEquipeID() == null) {
                throw new Exception("Dados inválidos");
            }
            else {
                String insert = "insert into Trabalho (Titulo, Descricao, DisciplinaID, EquipeID, Nota, Observacao)"
                        + "values ('" + t.getTitulo() + "', '" + t.getDescricao() + "', " + t.getDisciplinaID().getDisciplinaID() + ", " + t.getEquipeID().getEquipeID() + ", " + t.getNota() + ", '" + t.getObservacao() + "')";

                AcessoBanco bd = new AcessoBanco();
                bd.executar(insert);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
