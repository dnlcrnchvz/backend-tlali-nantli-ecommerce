package com.tlaliNantli.tlaliNantliBackend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Compras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private static Long id;
	private Date fecha;
	private boolean active;
	
@ManyToOne // muchas compras a un usuario
@JoinColumn(name = "Usuarios_id")
private Usuarios usuario;
@ManyToOne // una compra y varios estados
@JoinColumn (name = "Estado_id")
private EstadoCompra estado;
	
	public Compras() {}

	public Compras(Long id, Date fecha, Usuarios usuario, EstadoCompra estado) {
		Compras.id = id;
		this.fecha = fecha;
		this.usuario = usuario;
		this.estado = estado;
		
}
	public static Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public EstadoCompra getEstado() {
		return estado;
	}

	public void setEstado(EstadoCompra estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", usuario= " + usuario + ", estado de la compra=" + estado + "]";
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
}
