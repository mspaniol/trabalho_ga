package entidadesBD;

import entidadesBD.Equipealuno;
import entidadesBD.Turmaaluno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-25T20:05:36")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile ListAttribute<Aluno, Equipealuno> equipealunoList;
    public static volatile SingularAttribute<Aluno, Integer> alunoID;
    public static volatile ListAttribute<Aluno, Turmaaluno> turmaalunoList;
    public static volatile SingularAttribute<Aluno, String> nome;

}