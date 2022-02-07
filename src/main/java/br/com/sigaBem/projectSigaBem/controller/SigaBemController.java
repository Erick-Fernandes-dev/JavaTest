package br.com.sigaBem.projectSigaBem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.sigaBem.projectSigaBem.entity.CEP;

@RestController
@RequestMapping("/viacep/")
public class SigaBemController {
	
	@GetMapping("cep")
	public void buscaEndereco(String cep) {
		
//		ResponseEntity<CEP> respCep = new ResponseEntity<CEP>();
		
		RestTemplate template = new RestTemplate();
		
		String url = "https://viacep.com.br/ws/"+ cep +"/json/";
		
		ResponseEntity<CEP> response = template.getForEntity(url, CEP.class);
		
		System.out.println(response);
		
		
		
	}
	
	

}
