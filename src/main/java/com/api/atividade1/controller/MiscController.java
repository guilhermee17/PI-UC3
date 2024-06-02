package com.api.atividade1.controller;


import com.api.atividade1.model.Aparelhos;
import com.api.atividade1.model.Funcionarios;
import com.api.atividade1.model.Alunos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MiscController {

   private static List<Alunos> alunosCadastrados = new ArrayList<>();
   private static List<Funcionarios> funcionariosCadastrados = new ArrayList<>();
   private static List<Aparelhos> aparelhosCadastrados = new ArrayList<>();
    
     @GetMapping("/cadastrarAlunos")
    public String mostrarFormulárioAlunos(Model model) {
        model.addAttribute("aluno", new Alunos()); 
        model.addAttribute("alunosCadastrados", alunosCadastrados); 
        return "cadastrarAlunos";
    }
    
   @PostMapping("/cadastrarAlunos")
    public String processarFormulárioAlunos(@ModelAttribute Alunos aluno) {
        alunosCadastrados.add(aluno);
        return "redirect:/cadastrarAlunos"; 
    }
   
    @GetMapping("/cadastrarFuncionarios")
    public String mostrarFormulárioFuncionarios(Model model) {
        model.addAttribute("funcionario", new Funcionarios()); 
        model.addAttribute("funcionariosCadastrados", funcionariosCadastrados); 
        return "cadastrarFuncionarios";
    }

    @PostMapping("/cadastrarFuncionarios")
    public String processarFormulárioFuncionarios(@ModelAttribute Funcionarios funcionario) {
        funcionariosCadastrados.add(funcionario);
        return "redirect:/cadastrarFuncionarios"; 
    }
    
     @GetMapping("/cadastrarAparelhos")
    public String mostrarFormulárioAparelhos(Model model) {
        model.addAttribute("aparelho", new Aparelhos()); 
        model.addAttribute("aparelhosCadastrados", aparelhosCadastrados); 
        return "cadastrarAparelhos";
    }
    
    @PostMapping("/cadastrarAparelhos")
    public String processarFormulárioAparelhos(@ModelAttribute Aparelhos aparelho) {
        aparelhosCadastrados.add(aparelho);
        return "redirect:/aparelhoCadastrados"; 
    }
}