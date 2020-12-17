package spkqnllgang.bibliotheque.Controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/{id}")
    public Optional<Categorie> getCategorie(@PathVariable("id") int id){
        return categorieRepository.findById(id);
    }

    @GetMapping("/search/{nom}")
    public Set<Categorie> findCategorieByNom(@PathVariable("nom") String nom){
        return categorieRepository.findCategorieByNom(nom);
    }
    
    @PutMapping("/update/{id}")
    public void updateCategorie(@PathVariable("id") int id, @RequestBody Categorie categorie) {
        Optional<Categorie> categorieData = categorieRepository.findById(id);
        
        if(categorieData.isPresent()) {
            Categorie cat = categorieData.get();
            cat.setNom(categorie.getNom());
        }
    }
}