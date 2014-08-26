package entidadesBD;

import entidadesBD.Disciplina;
import entidadesBD.Equipe;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-25T22:07:34")
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