package dev.java10x.CadastroDeNinjas.Controller;

import dev.java10x.CadastroDeNinjas.Model.DTOs.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<NinjaDTO> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/listar/{id}")
    public NinjaDTO listarPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Ninja criado";
    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }


    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }


}
