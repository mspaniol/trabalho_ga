/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controles;

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
        this.disciplinaID = disciplinaID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "controles.Disciplina[ disciplinaID=" + disciplinaID + " ]";
    }
    
}
