package br.com.ldap.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapAuthenticationController {
	@GetMapping("/")
	  public String index() {
	    return "Bem-vindo/a à pagina inicial!";
	  }
}
