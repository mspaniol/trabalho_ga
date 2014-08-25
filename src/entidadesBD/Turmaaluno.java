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
@Table(name = "turmaaluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turmaaluno.findAll", query = "SELECT t FROM Turmaaluno t"),
    @NamedQuery(name = "Turmaaluno.findByTurmaAlunoID", query = "SELECT t FROM Turmaaluno t WHERE t.turmaAlunoID = :turmaAlunoID")})
public class Turmaaluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TurmaAlunoID")
    private Integer turmaAlunoID;
    @JoinColumn(name = "TurmaID", referencedColumnName = "TurmaID")
    @ManyToOne(optional = false)
    private Turma turmaID;
    @JoinColumn(name = "AlunoID", referencedColumnName = "AlunoID")
    @ManyToOne(optional = false)
    private Aluno alunoID;

    public Turmaaluno() {
    }

    public Turmaaluno(Integer turmaAlunoID) {
        this.turmaAlunoID = turmaAlunoID;
    }

    public Integer getTurmaAlunoID() {
        return turmaAlunoID;
    }

    public void setTurmaAlunoID(Integer turmaAlunoID) {
        this.turmaAlunoID = turmaAlunoID;
    }

    public Turma getTurmaID() {
        return turmaID;
    }

    public void setTurmaID(Turma turmaID) {
        this.turmaID = turmaID;
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
        hash += (turmaAlunoID != null ? turmaAlunoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turmaaluno)) {
            return false;
        }
        Turmaaluno other = (Turmaaluno) object;
        if ((this.turmaAlunoID == null && other.turmaAlunoID != null) || (this.turmaAlunoID != null && !this.turmaAlunoID.equals(other.turmaAlunoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesBD.Turmaaluno[ turmaAlunoID=" + turmaAlunoID + " ]";
    }
    
}
