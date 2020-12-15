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

import spkqnllgang.bibliotheque.Entity.Auteur;
import spkqnllgang.bibliotheque.Repository.AuteurRepository;

@RestController
@RequestMapping(path = "/auteur")
public class AuteurController {
    @Autowired
    private AuteurRepository auteurRepository;

    @GetMapping
    public Iterable<Auteur> getAuteurs(){
        return auteurRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Auteur> getAuteur(@PathVariable("id") int id){
        return auteurRepository.findById(id);
    }

    @GetMapping("/search/{nom}")
    public Set<Auteur> findAuteurByNom(@PathVariable("nom") String nom){
        return auteurRepository.findAuteurByNom(nom);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAuteurById(@PathVariable("id") int id){
        auteurRepository.deleteById(id);
    }

    @PostMapping("/add")
    public void saveAuteur(Auteur auteur){
        auteurRepository.save(auteur);
    }

    /*@PutMapping("/update/id")
    public void updateAuteur(@PathVariable(value = "id") int id, Auteur auteur){
        
    }*/

}