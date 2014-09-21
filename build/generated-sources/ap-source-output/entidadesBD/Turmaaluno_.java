package entidadesBD;

import entidadesBD.Aluno;
import entidadesBD.Turma;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-21T20:09:08")
@StaticMetamodel(Turmaaluno.class)
public class Turmaaluno_ { 

    public static volatile SingularAttribute<Turmaaluno, Integer> turmaAlunoID;
    public static volatile SingularAttribute<Turmaaluno, Turma> turmaID;
    public static volatile SingularAttribute<Turmaaluno, Aluno> alunoID;

}