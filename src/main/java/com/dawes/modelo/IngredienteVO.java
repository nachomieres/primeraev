package com.dawes.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="ingrediente")
public class IngredienteVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idingrediente;
	private String denominacion;
	
	@OneToMany(mappedBy="ingrediente")
	List<IngredienteRecetaVO> recetas;

	public int getIdingrediente() {
		return idingrediente;
	}

	public void setIdingrediente(int idingrediente) {
		this.idingrediente = idingrediente;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public List<IngredienteRecetaVO> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<IngredienteRecetaVO> recetas) {
		this.recetas = recetas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + ((recetas == null) ? 0 : recetas.hashCode());
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
		IngredienteVO other = (IngredienteVO) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (recetas == null) {
			if (other.recetas != null)
				return false;
		} else if (!recetas.equals(other.recetas))
			return false;
		return true;
	}

	public IngredienteVO(int idingrediente, String denominacion, List<IngredienteRecetaVO> recetas) {
		super();
		this.idingrediente = idingrediente;
		this.denominacion = denominacion;
		this.recetas = recetas;
	}

	public IngredienteVO(String denominacion, List<IngredienteRecetaVO> recetas) {
		super();
		this.denominacion = denominacion;
		this.recetas = recetas;
	}

	public IngredienteVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IngredienteVO [idingrediente=" + idingrediente + ", denominacion=" + denominacion + ", recetas="
				+ recetas + "]";
	}	
}
