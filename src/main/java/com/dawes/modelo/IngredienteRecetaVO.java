package com.dawes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="ingredienteReceta")
public class IngredienteRecetaVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idingredienteReceta;
	
	@ManyToOne
	@JoinColumn(name="idreceta")
	private RecetaVO receta;	
	@ManyToOne
	@JoinColumn(name="idingrediente")
	private IngredienteVO ingrediente;
	
	private int cantidad;

	public int getIdingredienteReceta() {
		return idingredienteReceta;
	}

	public void setIdingredienteReceta(int idingredienteReceta) {
		this.idingredienteReceta = idingredienteReceta;
	}

	public RecetaVO getReceta() {
		return receta;
	}

	public void setReceta(RecetaVO receta) {
		this.receta = receta;
	}

	public IngredienteVO getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(IngredienteVO ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public IngredienteRecetaVO(int idingredienteReceta, RecetaVO receta, IngredienteVO ingrediente, int cantidad) {
		super();
		this.idingredienteReceta = idingredienteReceta;
		this.receta = receta;
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
	}

	public IngredienteRecetaVO(RecetaVO receta, IngredienteVO ingrediente, int cantidad) {
		super();
		this.receta = receta;
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
	}

	public IngredienteRecetaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + idingredienteReceta;
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
		result = prime * result + ((receta == null) ? 0 : receta.hashCode());
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
		IngredienteRecetaVO other = (IngredienteRecetaVO) obj;
		if (cantidad != other.cantidad)
			return false;
		if (idingredienteReceta != other.idingredienteReceta)
			return false;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		if (receta == null) {
			if (other.receta != null)
				return false;
		} else if (!receta.equals(other.receta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IngredienteRecetaVO [idingredienteReceta=" + idingredienteReceta + ", receta=" + receta
				+ ", ingrediente=" + ingrediente + ", cantidad=" + cantidad + "]";
	}
	
	
	

}
