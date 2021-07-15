package com.tonmovies.watchMovies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonmovies.watchMovies.model.Movies;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
	
	//Busca pelo titulo(IgnoreCase) 
	public List<Movies> findAllByTitleContainingIgnoreCase (String title);
	
	//Busca pelo genero(IgnoreCases)
	public List<Movies> findAllByGenresContainingIgnoreCase (String genres);
	

}
