package com.innovatecodegroup.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="residente")
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8411801793365407459L;
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private String tipoDocumento;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido;
	@Column(nullable=false)
	private String direccion;
	@Column(unique=true)
	private Long telefono;
	@Column(length=150)
	private String correo;
	private String usuario;
	private String constraseña;
	private Integer tipoUsuario;
	
	
	
	
	
	public Usuario() {
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getConstraseña() {
		return constraseña;
	}
	public void setConstraseña(String constraseña) {
		this.constraseña = constraseña;
	}
	public Integer getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, constraseña, correo, direccion, id, nombre, telefono, tipoDocumento, tipoUsuario,
				usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(constraseña, other.constraseña)
				&& Objects.equals(correo, other.correo) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(tipoDocumento, other.tipoDocumento)
				&& Objects.equals(tipoUsuario, other.tipoUsuario) && Objects.equals(usuario, other.usuario);
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", usuario="
				+ usuario + ", constraseña=" + constraseña + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
}
 