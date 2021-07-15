package com.tonmovies.watchMovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tonmovies.watchMovies.model.Movies;
import com.tonmovies.watchMovies.repository.MoviesRepository;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MoviesController {
	
	@Autowired
	private MoviesRepository repository;
	
	//Método responsável por buscar todos os filmes(ignoreCase)
	@GetMapping
	public ResponseEntity<List<Movies>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//Método responsável por buscar filmes por ID
	@GetMapping("/{movieId}")
	public ResponseEntity<Movies> GetById(@PathVariable long movieId){
		return repository.findById(movieId)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());	// Não encontrando o ID(NotFound)	
	}
	
	//Método responsável por buscar filmes pelo titulo(ignoreCase)
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Movies>> GetByTitulo(@PathVariable String title) {
				return ResponseEntity.ok(repository.findAllByTitleContainingIgnoreCase(title));		
	}
	
	//Método responsável por buscar filmes pelo genero(ignoreCase)
	@GetMapping("/genres/{genres}")
	public ResponseEntity<List<Movies>> getByGenres(@PathVariable String genres) {
		return ResponseEntity.ok(repository.findAllByGenresContainingIgnoreCase(genres));
	}

	//Método POST
	@PostMapping
	public ResponseEntity<Movies> post (@RequestBody Movies movies){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(movies));
	}
	
	//Método PUT
	@PutMapping
	public ResponseEntity<Movies> put (@RequestBody Movies movies){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(movies));
	}
	
	//Método DELETE
	@DeleteMapping("/{movieId}")
	public void delete(@PathVariable long movieId) {
		repository.deleteById(movieId);
	}
	
	
}
