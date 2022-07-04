package com.hyrum.dominguez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.hyrum.dominguez.model.Categoria;
import com.hyrum.dominguez.model.Vacante;
import com.hyrum.dominguez.service.IntCategorias;
import com.hyrum.dominguez.service.IntVacantes;
@Controller
public class HomeController {

	@Autowired
	private IntVacantes serviceVacantes;

	@Autowired
	private IntCategorias serviceCategorias;

	@GetMapping("/home")
	public String mostrarHome(Model model) {
		List<Vacante> lista = serviceVacantes.obtenerTodas();
		List<Categoria> categorias = serviceCategorias.obtenerTodas();
		model.addAttribute("vacantes", lista);
		model.addAttribute("categorias", categorias);
		return "home";
	}

}
