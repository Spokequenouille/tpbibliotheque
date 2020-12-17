package spkqnllgang.bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spkqnllgang.bibliotheque.Entity.Categorie;
import spkqnllgang.bibliotheque.Repository.CategorieRepository;
@RestController
@RequestMapping(path = "/categorie")
public class CategorieController {
    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping
    public Iterable<Categorie> getCategories(){
        return categorieRepository.findAll();
    }
}