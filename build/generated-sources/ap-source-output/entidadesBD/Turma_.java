package entidadesBD;

import entidadesBD.Disciplina;
import entidadesBD.Turmaaluno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-25T20:05:36")
@StaticMetamodel(Turma.class)
public class Turma_ { 

    public static volatile SingularAttribute<Turma, Integer> turmaID;
    public static volatile SingularAttribute<Turma, String> semestre;
    public static volatile SingularAttribute<Turma, Disciplina> disciplinaID;
    public static volatile ListAttribute<Turma, Turmaaluno> turmaalunoList;

}