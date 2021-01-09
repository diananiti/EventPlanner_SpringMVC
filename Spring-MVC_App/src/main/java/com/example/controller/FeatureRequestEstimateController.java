package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeatureRequestEstimateController {

	//adding handler mappings
	@GetMapping
	public String incepeEstimateRequest() {
		
		//aici va fi adaugat formularul pe care il primeste de la server prima data clientul 
		return "formular" ;//return logical view name - aici poate fi HTML sau JSP/ sau alte tipuri de fisiere folosite pt view
	}
	
	//dupa ce clientul completeaza acel formular cu nume etc si alte nume de eveniment
	//vor dori sa salveze sau sa post-eze acel formular
	
	// cum? PostMapping+Handelr pentru post mapping. Handlerul trebuie sa fie o metoda separata
	@PostMapping
	public String trimiteEstimareRequest() {
		
		//adaugare implementare
		return "confirmareTrimitere "; //poate o alta pagina cu mesajul de confirmare daca a fost primit sau nu
	}
}
