package com.me.boot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.boot.model.Curso;
import com.me.boot.repository.CursoRepository;



@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<Curso> listar() {
		return cursoRepository.findAll();
		
	}
	
	@PostMapping
	public Curso novo(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
		
	}
	
	@PutMapping("/{id}")
	public void UpdateCurso(@PathVariable Curso curso) {
		 cursoRepository.save(curso);
	}  
	
	@DeleteMapping("/{id}")
	public void DeleteCurso(@PathVariable Curso curso) {
		 cursoRepository.delete(curso);
	}  
}
