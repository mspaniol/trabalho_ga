package entidadesBD;

import entidadesBD.Disciplina;
import entidadesBD.Equipe;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-21T20:09:08")
@StaticMetamodel(Trabalho.class)
public class Trabalho_ { 

    public static volatile SingularAttribute<Trabalho, Integer> trabalhoID;
    public static volatile SingularAttribute<Trabalho, String> observacao;
    public static volatile SingularAttribute<Trabalho, Disciplina> disciplinaID;
    public static volatile SingularAttribute<Trabalho, String> titulo;
    public static volatile SingularAttribute<Trabalho, Equipe> equipeID;
    public static volatile SingularAttribute<Trabalho, Float> nota;
    public static volatile SingularAttribute<Trabalho, String> descricao;

}