package spkqnllgang.bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spkqnllgang.bibliotheque.Entity.Genre;
import spkqnllgang.bibliotheque.Repository.GenreRepository;
@RestController
@RequestMapping(path = "/genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public Iterable<Genre> getGenres(){
        return genreRepository.findAll();
    }
}
