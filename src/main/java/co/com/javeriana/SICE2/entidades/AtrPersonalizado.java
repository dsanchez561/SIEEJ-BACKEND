/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SICE2.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Javeriana
 */
@Entity
public class AtrPersonalizado {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String nombre;

    @Basic
    private String dato;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDato() {
        return this.dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}