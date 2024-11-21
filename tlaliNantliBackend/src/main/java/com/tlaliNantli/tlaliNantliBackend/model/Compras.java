package com.tlaliNantli.tlaliNantliBackend.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras") // Tabla compras
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime fecha;
	private boolean active;
	private String correo;

	@ManyToOne // muchas compras a un usuario
	@JoinColumn(name = "Usuarios_id")
	private Usuarios usuario;
	@ManyToOne // una compra y varios estados
	@JoinColumn(name = "Estado_id")
	private EstadoCompra estado;

	public Compras() {
	}

	public Compras(Long id, LocalDateTime fecha, Usuarios usuario, EstadoCompra estado) {
		this.id = id;
		this.fecha = fecha;
		this.usuario = usuario;
		this.estado = estado;

	}

	public Long getId() {
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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", usuario= " + usuario + ", estado de la compra=" + estado
				+ "]";
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
