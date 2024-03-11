package com.lp2.cl1ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Cl1MarioaliagaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cl1MarioaliagaApplication.class, args);
    }

    @Controller
    public class MainController {
        @GetMapping("/")
        public String mostrarPaginaPrincipal() {
            return "login";
        }
        
        @GetMapping("/home")
        public String mostrarPaginaHome() {
            return "home";
        }
        
        //MAPEO CONTACTO
    	@GetMapping("/contacto")
    	public String mostrarPaginaContacto() {
    		return "contact";
    	}
    	   	    	
    	
    }
}
