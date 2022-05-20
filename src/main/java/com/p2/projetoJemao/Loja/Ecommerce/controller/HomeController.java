package com.p2.projetoJemao.Loja.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // vamos mapear uma requisição do usuario e retornar a pagina Home

    @GetMapping("/administrativo")
    public String acessarPrincipal(){
    	System.out.println("teste");
        return "administrativo/home";
    }

}
