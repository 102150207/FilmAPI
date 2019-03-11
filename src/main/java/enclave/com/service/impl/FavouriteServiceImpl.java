package enclave.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enclave.com.entities.Favourite;
import enclave.com.entities.Film;
import enclave.com.repository.FavouriteRepository;
import enclave.com.repository.FilmRepository;
import enclave.com.service.FavouriteService;


@Service
public class FavouriteServiceImpl implements FavouriteService{

	@Autowired
	FilmRepository filmRepository;
	
	@Autowired
	FavouriteRepository favouriteRepository;

	@Override
	public List<Film> getListFilmFavourite(Integer id) {
		return filmRepository.getListFilmFavourite(id);
	}

	@Override
	public boolean addFavourite(Favourite favourite) {
		if(favourite!=null){
			favouriteRepository.save(favourite);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteFavourite(Integer id) {
		Favourite favourite = favouriteRepository.getOne(Long.parseLong(id+""));
		if(favourite!=null){
			favouriteRepository.delete(favourite);
			return true;
		}	
		return false;
	}
	

}
