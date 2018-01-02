/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SIEEJ.entidades;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Javeriana
 */
@Table(
	    uniqueConstraints=
	        @UniqueConstraint(columnNames={"username"})
	)
@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "Select e from Usuario e")
    ,@NamedQuery(name = "Usuario.findByusername", query = "Select u from Usuario u where u.username=:username")
    ,@NamedQuery(name = "Usuario.findByPassword", query = "Select u from Usuario u where u.password=:password")})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nombre;

    @Basic
    private String apellidos;

    @Basic
    private String username;

    @Basic
    private String password;
    
    @Basic
    private Boolean nuevo;

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

    public String getApellidos() {
        return this.apellidos;
    }
    
    

    /**
	 * @return the nuevo
	 */
	public Boolean getNuevo() {
		return nuevo;
	}

	/**
	 * @param nuevo the nuevo to set
	 */
	public void setNuevo(Boolean nuevo) {
		this.nuevo = nuevo;
	}

	public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}