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
@Table(name = "equipe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipe.findAll", query = "SELECT e FROM Equipe e"),
    @NamedQuery(name = "Equipe.findByEquipeID", query = "SELECT e FROM Equipe e WHERE e.equipeID = :equipeID"),
    @NamedQuery(name = "Equipe.findByNome", query = "SELECT e FROM Equipe e WHERE e.nome = :nome")})
public class Equipe implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EquipeID")
    private Integer equipeID;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipeID")
    private List<Equipealuno> equipealunoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipeID")
    private List<Trabalho> trabalhoList;

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
        Integer oldEquipeID = this.equipeID;
        this.equipeID = equipeID;
        changeSupport.firePropertyChange("equipeID", oldEquipeID, equipeID);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    @XmlTransient
    public List<Equipealuno> getEquipealunoList() {
        return equipealunoList;
    }

    public void setEquipealunoList(List<Equipealuno> equipealunoList) {
        this.equipealunoList = equipealunoList;
    }

    @XmlTransient
    public List<Trabalho> getTrabalhoList() {
        return trabalhoList;
    }

    public void setTrabalhoList(List<Trabalho> trabalhoList) {
        this.trabalhoList = trabalhoList;
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
        return this.getNome();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
