package entidadesBD;

import entidadesBD.Equipealuno;
import entidadesBD.Trabalho;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-08-25T20:05:36")
@StaticMetamodel(Equipe.class)
public class Equipe_ { 

    public static volatile ListAttribute<Equipe, Equipealuno> equipealunoList;
    public static volatile SingularAttribute<Equipe, String> nome;
    public static volatile ListAttribute<Equipe, Trabalho> trabalhoList;
    public static volatile SingularAttribute<Equipe, Integer> equipeID;

}