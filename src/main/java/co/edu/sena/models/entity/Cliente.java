package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column (name="idCliente")
	
	private int idCliente;

	
	@Column(name = "Nombre")
	private String nombre;

	
	@Column(name = "Apellido")
	private String apellido;

	
	@Column(name = "Identificación")
	private int identificacion;

	
	@Column(name = "Edad")
	private int edad;

	
	@Column(name = "Teléfono")
	private int telefono;

	
	@Column(name = "Email")
	private String email;

	public Cliente(int idCliente, String nombre, String apellido, int identificacion, int edad, int telefono,
			String email) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}

	public Cliente() {
		super();
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
