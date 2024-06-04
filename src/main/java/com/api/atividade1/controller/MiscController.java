package com.api.atividade1.controller;


import com.api.atividade1.model.Aparelhos;
import com.api.atividade1.model.Funcionarios;
import com.api.atividade1.model.Alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.api.atividade1.data.alunoRepository;
import com.api.atividade1.data.funcionariosRepository;
import com.api.atividade1.data.aparelhosRepository;

@Controller
public class MiscController {

   @Autowired
   private  alunoRepository alunoRepository;
   
   @Autowired
   private  funcionariosRepository funcionariosRepository;
   
   @Autowired
   private  aparelhosRepository aparelhosRepository;
    
     @GetMapping("/cadastrarAlunos")
    public String mostrarFormulárioAlunos(Model model) {
        model.addAttribute("aluno", new Alunos()); 
        model.addAttribute("alunosCadastrados", alunoRepository.findAll()); 
        return "cadastrarAlunos";
    }
    
   @PostMapping("/cadastrarAlunos")
    public String processarFormulárioAlunos(@ModelAttribute Alunos aluno) {
        alunoRepository.save(aluno);
        return "redirect:/cadastrarAlunos"; 
    }
   
    @GetMapping("/cadastrarFuncionarios")
    public String mostrarFormulárioFuncionarios(Model model) {
        model.addAttribute("funcionario", new Funcionarios()); 
        model.addAttribute("funcionariosCadastrados", funcionariosRepository.findAll()); 
        return "cadastrarFuncionarios";
    }

    @PostMapping("/cadastrarFuncionarios")
    public String processarFormulárioFuncionarios(@ModelAttribute Funcionarios funcionario) {
        funcionariosRepository.save(funcionario);
        return "redirect:/cadastrarFuncionarios"; 
    }
    
     @GetMapping("/cadastrarAparelhos")
    public String mostrarFormulárioAparelhos(Model model) {
        model.addAttribute("aparelho", new Aparelhos()); 
        model.addAttribute("aparelhosCadastrados", aparelhosRepository.findAll()); 
        return "cadastrarAparelhos";
    }
    
    @PostMapping("/cadastrarAparelhos")
public String processarFormulárioAparelhos(@ModelAttribute Aparelhos aparelho, Model model) {
    if (aparelho.getNome() == null || aparelho.getNome().isEmpty()) {
        model.addAttribute("error", "O nome do aparelho não pode estar vazio.");
        model.addAttribute("aparelho", aparelho);
        model.addAttribute("aparelhosCadastrados", aparelhosRepository.findAll());
        return "cadastrarAparelhos";
    } else {
        aparelhosRepository.save(aparelho);
        return "redirect:/cadastrarAparelhos";
    }
}
}