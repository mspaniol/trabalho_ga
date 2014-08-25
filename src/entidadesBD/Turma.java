/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadesBD;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mozart
 */
@Entity
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByTurmaID", query = "SELECT t FROM Turma t WHERE t.turmaID = :turmaID"),
    @NamedQuery(name = "Turma.findBySemestre", query = "SELECT t FROM Turma t WHERE t.semestre = :semestre")})
public class Turma implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TurmaID")
    private Integer turmaID;
    @Basic(optional = false)
    @Column(name = "Semestre")
    private String semestre;
    @JoinColumn(name = "DisciplinaID", referencedColumnName = "DisciplinaID")
    @ManyToOne(optional = false)
    private Disciplina disciplinaID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turmaID")
    private List<Turmaaluno> turmaalunoList;

    public Turma() {
    }

    public Turma(Integer turmaID) {
        this.turmaID = turmaID;
    }

    public Turma(Integer turmaID, String semestre) {
        this.turmaID = turmaID;
        this.semestre = semestre;
    }

    public Integer getTurmaID() {
        return turmaID;
    }

    public void setTurmaID(Integer turmaID) {
        Integer oldTurmaID = this.turmaID;
        this.turmaID = turmaID;
        changeSupport.firePropertyChange("turmaID", oldTurmaID, turmaID);
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        String oldSemestre = this.semestre;
        this.semestre = semestre;
        changeSupport.firePropertyChange("semestre", oldSemestre, semestre);
    }

    public Disciplina getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(Disciplina disciplinaID) {
        Disciplina oldDisciplinaID = this.disciplinaID;
        this.disciplinaID = disciplinaID;
        changeSupport.firePropertyChange("disciplinaID", oldDisciplinaID, disciplinaID);
    }

    @XmlTransient
    public List<Turmaaluno> getTurmaalunoList() {
        return turmaalunoList;
    }

    public void setTurmaalunoList(List<Turmaaluno> turmaalunoList) {
        this.turmaalunoList = turmaalunoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turmaID != null ? turmaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.turmaID == null && other.turmaID != null) || (this.turmaID != null && !this.turmaID.equals(other.turmaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getDisciplinaID().getNome() + " - " + this.getSemestre();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
