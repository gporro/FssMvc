package it.bata.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONI")
public class Telefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7440745210631742191L;


	@Id
	@Column(name="ID_NUM_TEL")
	private Integer idNumero;

	@Column(name="NUM_TELEFONICO")
	private String numeroTelefonico;	

	public Integer getIdNumero() {
		return idNumero;
	}

	public void setIdNumero(Integer idNumero) {
		this.idNumero = idNumero;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	@Override
	public String toString() {
		return "Telefono [idNumero=" + idNumero + ", numeroTelefonico="
				+ numeroTelefonico + "]";
	}


}


