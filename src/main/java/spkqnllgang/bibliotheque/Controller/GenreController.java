package spkqnllgang.bibliotheque.Controller;

import java.util.Optional;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
