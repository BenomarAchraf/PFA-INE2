package com.abdo.moviesms.Repositories;

import com.abdo.moviesms.Entities.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieRepository  extends MongoRepository<Serie,String> {
}
