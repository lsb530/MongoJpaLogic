package com.example.mongojpalogic.mflix.service;

import com.example.mongojpalogic.mflix.document.Movies;
import com.example.mongojpalogic.mflix.repository.MflixMovieRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MflixMovieService {

    private final MflixMovieRepository mflixMovieRepository;

    public List<Movies> getMflixMovies() {
        return mflixMovieRepository.findAll();
    }

    public Movies getMflixMovie(ObjectId id) {
        return mflixMovieRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
