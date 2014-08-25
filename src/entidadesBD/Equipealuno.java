/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadesBD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mozart
 */
@Entity
@Table(name = "equipealuno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipealuno.findAll", query = "SELECT e FROM Equipealuno e"),
    @NamedQuery(name = "Equipealuno.findByEquipeAluno", query = "SELECT e FROM Equipealuno e WHERE e.equipeAluno = :equipeAluno")})
public class Equipealuno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EquipeAluno")
    private Integer equipeAluno;
    @JoinColumn(name = "EquipeID", referencedColumnName = "EquipeID")
    @ManyToOne(optional = false)
    private Equipe equipeID;
    @JoinColumn(name = "AlunoID", referencedColumnName = "AlunoID")
    @ManyToOne(optional = false)
    private Aluno alunoID;

    public Equipealuno() {
    }

    public Equipealuno(Integer equipeAluno) {
        this.equipeAluno = equipeAluno;
    }

    public Integer getEquipeAluno() {
        return equipeAluno;
    }

    public void setEquipeAluno(Integer equipeAluno) {
        this.equipeAluno = equipeAluno;
    }

    public Equipe getEquipeID() {
        return equipeID;
    }

    public void setEquipeID(Equipe equipeID) {
        this.equipeID = equipeID;
    }

    public Aluno getAlunoID() {
        return alunoID;
    }

    public void setAlunoID(Aluno alunoID) {
        this.alunoID = alunoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipeAluno != null ? equipeAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipealuno)) {
            return false;
        }
        Equipealuno other = (Equipealuno) object;
        if ((this.equipeAluno == null && other.equipeAluno != null) || (this.equipeAluno != null && !this.equipeAluno.equals(other.equipeAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesBD.Equipealuno[ equipeAluno=" + equipeAluno + " ]";
    }
    
}
