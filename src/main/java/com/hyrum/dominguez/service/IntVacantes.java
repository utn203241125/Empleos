package com.hyrum.dominguez.service;

import java.util.List;

import com.hyrum.dominguez.model.Vacante;

public interface IntVacantes {
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vacante);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public long numeroVacantes();

}
