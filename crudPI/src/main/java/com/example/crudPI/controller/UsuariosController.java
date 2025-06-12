package com.example.crudPI.controller;

import com.example.crudPI.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @PostMapping("/cadastro")
    public String cadastrarUsuarios(@ModelAttribute User user, Model model){
        System.out.println("Nome: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Telefone: " + user.getPhone());
        System.out.println("CPF: " + user.getCpf());
        System.out.println("Senha: " + user.getPassword());

        model.addAttribute("mensagem", "Usuario cadastrado com sucesso!");

        return "CadastroSucesso";
    }
}
