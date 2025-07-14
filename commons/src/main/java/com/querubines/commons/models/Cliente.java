package com.querubines.commons.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PEDIDO_SEQ")
	@SequenceGenerator(name = "PEDIDO_SEQ", sequenceName = "PEDIDO_SEQ", allocationSize = 1)
	@Column(name = "ID_PEDIDO")
	private Long id;
	
	@Column (name = "ID_CLIENTE", nullable = false)
	private String nombre;
	
	@Column (name = "Total", nullable = false)
	private String apellido;
	
	@Column (name = "FECHA_CREACION", nullable = false)
	private String email;
	
	@Column (name = "ESTADO", nullable = false)
	private int telefono;
	
	@Column (name = "FECHA_CREACION", nullable = false)
	private String direccion;

}
