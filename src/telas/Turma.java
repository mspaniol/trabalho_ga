/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author mozart
 */
@Entity
@Table(name = "turma", catalog = "trabalho_ga", schema = "")
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByTurmaID", query = "SELECT t FROM Turma t WHERE t.turmaID = :turmaID"),
    @NamedQuery(name = "Turma.findByDisciplinaID", query = "SELECT t FROM Turma t WHERE t.disciplinaID = :disciplinaID"),
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
    @Column(name = "DisciplinaID")
    private int disciplinaID;
    @Basic(optional = false)
    @Column(name = "Semestre")
    private String semestre;

    public Turma() {
    }

    public Turma(Integer turmaID) {
        this.turmaID = turmaID;
    }

    public Turma(Integer turmaID, int disciplinaID, String semestre) {
        this.turmaID = turmaID;
        this.disciplinaID = disciplinaID;
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

    public int getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(int disciplinaID) {
        int oldDisciplinaID = this.disciplinaID;
        this.disciplinaID = disciplinaID;
        changeSupport.firePropertyChange("disciplinaID", oldDisciplinaID, disciplinaID);
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        String oldSemestre = this.semestre;
        this.semestre = semestre;
        changeSupport.firePropertyChange("semestre", oldSemestre, semestre);
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
        return "telas.Turma[ turmaID=" + turmaID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
