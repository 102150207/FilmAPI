package enclave.com.service;

import java.util.List;

import enclave.com.entities.Favourite;
import enclave.com.entities.Film;

public interface FavouriteService {
	
	List<Film> getListFilmFavourite(Integer id);
	boolean addFavourite(Favourite favourite);
	
	boolean deleteFavourite(Integer id);

}
