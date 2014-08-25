/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. testre
 */

package controles;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mozart
 */
@Entity
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d"),
    @NamedQuery(name = "Disciplina.findByDisciplinaID", query = "SELECT d FROM Disciplina d WHERE d.disciplinaID = :disciplinaID"),
    @NamedQuery(name = "Disciplina.findByNome", query = "SELECT d FROM Disciplina d WHERE d.nome = :nome")})
public class Disciplina implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DisciplinaID")
    private Integer disciplinaID;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;

    public Disciplina() {
    }

    public Disciplina(Integer disciplinaID) {
        this.disciplinaID = disciplinaID;
    }

    public Disciplina(Integer disciplinaID, String nome) {
        this.disciplinaID = disciplinaID;
        this.nome = nome;
    }

    public Integer getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(Integer disciplinaID) {
        Integer oldDisciplinaID = this.disciplinaID;
        this.disciplinaID = disciplinaID;
        changeSupport.firePropertyChange("disciplinaID", oldDisciplinaID, disciplinaID);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    @Override  
    public String toString() {  
        return this.getNome();
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (disciplinaID != null ? disciplinaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.disciplinaID == null && other.disciplinaID != null) || (this.disciplinaID != null && !this.disciplinaID.equals(other.disciplinaID))) {
            return false;
        }
        return true;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
