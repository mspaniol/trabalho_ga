/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * @author Jonathan
 */
@Entity
@Table(name = "equipealuno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipeAluno.findAll", query = "SELECT * FROM equipealuno"),
    @NamedQuery(name = "EquipeAluno.findByEquipeAlunoID", query = "SELECT * FROM EquipeAluno AS e WHERE e.equipeAlunoID = :equipeAlunoID")})
public class EquipeAluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EquipeAlunoID")
    private Integer equipeAlunoID;
    @Basic(optional = false)
    @Column(name = "equipeID")
    private int equipeID;
    @Basic(optional = false)
    @Column(name = "alunoID")
    private int alunoID;

    public EquipeAluno() {
    }

    public EquipeAluno(Integer equipeAlunoID) {
        this.equipeAlunoID = equipeAlunoID;
    }

    public EquipeAluno(Integer equipeAlunoID, int equipeID, int alunoID) {
        this.equipeAlunoID = equipeAlunoID;
        this.equipeID = equipeID;
        this.alunoID = alunoID;
    }

    public Integer getEquipeAlunoID() {
        return equipeAlunoID;
    }

    public void setEquipeAlunoID(Integer equipeAlunoID) {
        this.equipeAlunoID = equipeAlunoID;
    }

    public int getEquipeID() {
        return equipeID;
    }

    public void setEquipeID(int equipeID) {
        this.equipeID = equipeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipeAlunoID != null ? equipeAlunoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipeAluno)) {
            return false;
        }
        EquipeAluno other = (EquipeAluno) object;
        if ((this.equipeAlunoID == null && other.equipeAlunoID != null) || (this.equipeAlunoID != null && !this.equipeAlunoID.equals(other.equipeAlunoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.EquipeAluno[ EquipeAlunoID=" + equipeAlunoID + " ]";
    }
}
