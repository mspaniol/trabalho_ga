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
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT * FROM Equipe"),
    @NamedQuery(name = "Equipe.findByEquipeID", query = "SELECT * FROM Equipe AS e WHERE e.equipeID = :equipeID"),
    @NamedQuery(name = "Equipe.findByNome", query = "SELECT * FROM Equipe AS e WHERE e.nome = :nome")})
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EquipeID")
    private Integer equipeID;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;

    public Equipe() {
    }

    public Equipe(Integer equipeID) {
        this.equipeID = equipeID;
    }

    public Equipe(Integer equipeID, String nome) {
        this.equipeID = equipeID;
        this.nome = nome;
    }

    public Integer getEquipeID() {
        return equipeID;
    }

    public void setEquipeID(Integer equipeID) {
        this.equipeID = equipeID;
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
        hash += (equipeID != null ? equipeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.equipeID == null && other.equipeID != null) || (this.equipeID != null && !this.equipeID.equals(other.equipeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Equipe[ equipeID=" + equipeID + " ]";
    }

   
}
