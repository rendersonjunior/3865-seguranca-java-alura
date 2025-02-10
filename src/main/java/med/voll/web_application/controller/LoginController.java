package med.voll.web_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String carregaPaginaListagem() {
        return "autenticacao/login";
    }

    @GetMapping("/logout")
    public String carregaPaginaLogout() {
        return "autenticacao/logout";
    }
}
