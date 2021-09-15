package br.com.fiap.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.AlunoModel;

@Controller
public class AlunoController {

	//endereço url
	@RequestMapping(value = { "/lista", "/" }, method = RequestMethod.GET)
	public String getAluno(Model model) {

		ArrayList<AlunoModel> alunos = new ArrayList<AlunoModel>();
		alunos.add(new AlunoModel("Jose", "12345", "3SI"));
		alunos.add(new AlunoModel("Maria", "12346", "2SI"));
		alunos.add(new AlunoModel("Pedro", "12347", "3SI"));

		model.addAttribute("listaAlunos", alunos); //apelido utilizado para caregar dados no jsp
		return "alunos"; //faz a chamada do jsp na pages
	}

}
