package enclave.com.service;

import java.util.List;

import enclave.com.entities.Film;

public interface FilmService {
	List<Film> findAllFilm();
	List<Film> getTopFilm(String chars);

}
