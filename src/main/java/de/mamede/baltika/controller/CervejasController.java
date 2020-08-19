package de.mamede.baltika.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import de.mamede.baltika.model.Cerveja;
import de.mamede.baltika.model.Cliente;

@Controller
public class CervejasController {
	
	@RequestMapping( "/cervejas/novaCerveja" )
	public String novaCerveja( Cerveja cerveja ) {
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping("/clientes/novoCliente")
	public String novoCliente(Cliente cliente) {
		return "cliente/CadastroCliente";
	}
	
	@RequestMapping( value = "/cervejas/novaCerveja", method = RequestMethod.POST )
	private String cadastrarCerveja( @Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes ) {
		
		if ( result.hasErrors() ) {
			return novaCerveja( cerveja );
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso");
		return "redirect:/cervejas/novaCerveja";
	}
	
	@RequestMapping( value = "/clientes/novoCliente", method = RequestMethod.POST) 
	private String cadastrarCliente(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes ) {
		
		if ( result.hasErrors() ) {
			return novoCliente ( cliente );
		}
		
		attributes.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso");
		return "redirect:/clientes/novoCliente";
	}
	
}
