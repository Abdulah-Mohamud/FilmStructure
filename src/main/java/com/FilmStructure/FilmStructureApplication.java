package com.FilmStructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/films")
public class FilmStructureApplication {
	@Autowired
	private FilmRepository filmRepository;

	/*public FilmStructureApplication() {
		Film batman = new Film("Batman","crime-fighting",2.7,4.7);
		Film Flash = new Film("Flash","Fast",2.1,5.0);
		Film superman = new Film("Superman","Strong",2.8,4.1);
	}
	 */
	public static void main(String[] args) {
		SpringApplication.run(FilmStructureApplication.class, args);
	}


	@GetMapping("/getfilm")
	public String workResponse(){
		Film worker = new Film("Batman","Superhero",2.4,4.7);

		return worker.getFilmInfo();
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Film> getAllUsers(){
		return filmRepository.findAll();
	}
}
