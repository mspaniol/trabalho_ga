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
import javax.persistence.Lob;
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
@Table(name = "trabalho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabalho.findAll", query = "SELECT t FROM Trabalho t"),
    @NamedQuery(name = "Trabalho.findByTrabalhoID", query = "SELECT t FROM Trabalho t WHERE t.trabalhoID = :trabalhoID"),
    @NamedQuery(name = "Trabalho.findByTitulo", query = "SELECT t FROM Trabalho t WHERE t.titulo = :titulo"),
    @NamedQuery(name = "Trabalho.findByNota", query = "SELECT t FROM Trabalho t WHERE t.nota = :nota")})
public class Trabalho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TrabalhoID")
    private Integer trabalhoID;
    @Basic(optional = false)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @Lob
    @Column(name = "Descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Nota")
    private Float nota;
    @Lob
    @Column(name = "Oberva\u00e7\u00e3o")
    private String obervação;
    @JoinColumn(name = "DisciplinaID", referencedColumnName = "DisciplinaID")
    @ManyToOne(optional = false)
    private Disciplina disciplinaID;
    @JoinColumn(name = "EquipeID", referencedColumnName = "EquipeID")
    @ManyToOne(optional = false)
    private Equipe equipeID;

    public Trabalho() {
    }

    public Trabalho(Integer trabalhoID) {
        this.trabalhoID = trabalhoID;
    }

    public Trabalho(Integer trabalhoID, String titulo, String descricao) {
        this.trabalhoID = trabalhoID;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Integer getTrabalhoID() {
        return trabalhoID;
    }

    public void setTrabalhoID(Integer trabalhoID) {
        this.trabalhoID = trabalhoID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getObervação() {
        return obervação;
    }

    public void setObervação(String obervação) {
        this.obervação = obervação;
    }

    public Disciplina getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(Disciplina disciplinaID) {
        this.disciplinaID = disciplinaID;
    }

    public Equipe getEquipeID() {
        return equipeID;
    }

    public void setEquipeID(Equipe equipeID) {
        this.equipeID = equipeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trabalhoID != null ? trabalhoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabalho)) {
            return false;
        }
        Trabalho other = (Trabalho) object;
        if ((this.trabalhoID == null && other.trabalhoID != null) || (this.trabalhoID != null && !this.trabalhoID.equals(other.trabalhoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesBD.Trabalho[ trabalhoID=" + trabalhoID + " ]";
    }
    
}
