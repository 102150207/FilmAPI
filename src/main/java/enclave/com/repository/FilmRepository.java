package enclave.com.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import enclave.com.entities.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{
	
	@Query(value="SELECT * FROM film  ORDER BY id_film ASC Limit 0, 12	", nativeQuery=true)
	List<Film> getFilmLimit12();
	
	@Query("SELECT e FROM Film e")
	List<Film> getFilmPage(Pageable pageable);
	
	/* the function getRandomFilm() is not use in project */
	@Query(nativeQuery=true, value="SELECT * FROM film RAND LIMIT 5")
	List<Film> getRandomFilm();
	
	@Query(value="SELECT * FROM film ORDER BY views_week DESC Limit 0, 12 ", nativeQuery=true)
	List<Film> getFilmWeek();
	
	@Query(value="SELECT * FROM film ORDER BY views_month DESC Limit 0, 12 ", nativeQuery=true)
	List<Film> getFilmMonth();
}
