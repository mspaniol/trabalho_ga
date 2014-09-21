package entidadesBD;

import entidadesBD.Trabalho;
import entidadesBD.Turma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-21T20:09:08")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ { 

    public static volatile SingularAttribute<Disciplina, Integer> disciplinaID;
    public static volatile ListAttribute<Disciplina, Trabalho> trabalhoList;
    public static volatile SingularAttribute<Disciplina, String> nome;
    public static volatile ListAttribute<Disciplina, Turma> turmaList;

}