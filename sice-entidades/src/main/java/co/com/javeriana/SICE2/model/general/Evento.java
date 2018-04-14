/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SICE2.model.general;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Javeriana
 */
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    private Date inicio;
    
    @Basic
    private Date fin;
    
    @Basic
    private String titulo;
    
    @Basic
    private String descripcion;
    
    @Basic
    private String requisitos;
    
    @Basic
    private int capacidadMaxima;
    
    @JsonIgnore
    @ManyToOne(targetEntity = UsuarioJaveriana.class)
    private UsuarioJaveriana creador;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    private List<UsuarioJaveriana> inscritos;
    
    @OneToMany(targetEntity = AtrPersonalizado.class)
    private List<AtrPersonalizado> atrPersonalizados;
    
    @JsonIgnore
    @ManyToMany(targetEntity = Etiqueta.class)
    private List<Etiqueta> etiquetas;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the capacidadMaxima
	 */
	public int getCapacidad_maxima() {
		return capacidadMaxima;
	}

	/**
	 * @param capacidadMaxima the capacidadMaxima to set
	 */
	public void setCapacidad_maxima(int capacidad_maxima) {
		this.capacidadMaxima = capacidad_maxima;
	}

	/**
	 * @return the creador
	 */
	public UsuarioJaveriana getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(UsuarioJaveriana creador) {
		this.creador = creador;
	}

	/**
	 * @return the inscritos
	 */
	public List<UsuarioJaveriana> getInscritos() {
		return inscritos;
	}

	/**
	 * @param inscritos the inscritos to set
	 */
	public void setInscritos(List<UsuarioJaveriana> inscritos) {
		this.inscritos = inscritos;
	}

	/**
	 * @return the etiquetas
	 */
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	/**
	 * @param etiquetas the etiquetas to set
	 */
	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the requisitos
	 */
	public String getRequisitos() {
		return requisitos;
	}

	/**
	 * @param requisitos the requisitos to set
	 */
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	/**
	 * @return the atrPersonalizados
	 */
	public List<AtrPersonalizado> getAtrPersonalizados() {
		return atrPersonalizados;
	}

	/**
	 * @param atrPersonalizados the atrPersonalizados to set
	 */
	public void setAtrPersonalizados(List<AtrPersonalizado> atrPersonalizados) {
		this.atrPersonalizados = atrPersonalizados;
	}
}