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
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT * FROM Aluno"),
    @NamedQuery(name = "Aluno.findByAlunoID", query = "SELECT * FROM Aluno AS a WHERE a.alunoID = :alunoID"),
    @NamedQuery(name = "Aluno.findByNome", query = "SELECT * FROM Aluno AS a WHERE a.nome = :nome")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AlunoID")
    private Integer alunoID;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;

    public Aluno() {
    }

    public Aluno(Integer alunoID) {
        this.alunoID = alunoID;
    }

    public Aluno(Integer alunoID, String nome) {
        this.alunoID = alunoID;
        this.nome = nome;
    }

    public Integer getAlunoID() {
        return alunoID;
    }

    public void setAlunoID(Integer alunoID) {
        this.alunoID = alunoID;
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
        hash += (alunoID != null ? alunoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.alunoID == null && other.alunoID != null) || (this.alunoID != null && !this.alunoID.equals(other.alunoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Aluno[ alunoID=" + alunoID + " ]";
    }

}
