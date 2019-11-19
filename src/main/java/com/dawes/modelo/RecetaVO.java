package com.dawes.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="receta")
public class RecetaVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idreceta;
	private String denominacion;
	
	@OneToMany(mappedBy="receta", cascade= {CascadeType.ALL})
	List<IngredienteRecetaVO> ingredientes;

	public int getIdreceta() {
		return idreceta;
	}

	public void setIdreceta(int idreceta) {
		this.idreceta = idreceta;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public List<IngredienteRecetaVO> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<IngredienteRecetaVO> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public RecetaVO(int idreceta, String denominacion, List<IngredienteRecetaVO> ingredientes) {
		super();
		this.idreceta = idreceta;
		this.denominacion = denominacion;
		this.ingredientes = ingredientes;
	}

	public RecetaVO(String denominacion, List<IngredienteRecetaVO> ingredientes) {
		super();
		this.denominacion = denominacion;
		this.ingredientes = ingredientes;
	}

	public RecetaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + idreceta;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecetaVO other = (RecetaVO) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (idreceta != other.idreceta)
			return false;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecetaVO [idreceta=" + idreceta + ", denominacion=" + denominacion + ", ingredientes=" + ingredientes
				+ "]";
	}
	
	

}
