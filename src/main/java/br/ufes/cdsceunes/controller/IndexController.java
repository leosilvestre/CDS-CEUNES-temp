package br.ufes.cdsceunes.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class IndexController {

	// localhost:8080/cdsceunes/
	@Get("/")
	public void home() { }
}
