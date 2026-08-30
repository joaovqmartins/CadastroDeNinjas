package dev.java10x.CadastroDeNinjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/boasvindas")
    public String boasVindas() {
    return "Seja bem vindo!";
    }


    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Ninja criado";
    }

    @PutMapping("/alterarID")
    public String mostrarTodosOsNinjasPorId() {
        return "Mostrar Ninja por id";
    }

    @DeleteMapping
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }


}
