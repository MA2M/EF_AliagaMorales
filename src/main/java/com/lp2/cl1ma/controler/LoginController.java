package com.lp2.cl1ma.controler;

import com.lp2.cl1ma.interfaces.IUsuario;
import com.lp2.cl1ma.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private IUsuario usuarioRepository;

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    @PostMapping("/login")
    public String loginProcess(@RequestParam String username, @RequestParam String password, Model model, HttpServletRequest request) {     
        Usuario usuario = usuarioRepository.findByUsername(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", usuario.getId());
            return "redirect:/home";
        } else {  
            model.addAttribute("error", true);
            return "login";
        }
    }
}
