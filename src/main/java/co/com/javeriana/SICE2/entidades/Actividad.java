/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SICE2.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Javeriana
 */
@Entity
public class Actividad extends Evento {

	/**
	 * TODO:: A futuro se implementará el nombre
	 */
    /*@Basic
    @JsonIgnore
    private String nombre;*/

    @OneToMany(targetEntity = Horario.class)
    @JsonIgnore
    private List<Horario> horarios;

   /* public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public List<Horario> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

}