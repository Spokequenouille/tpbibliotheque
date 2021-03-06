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
import org.springframework.web.bind.annotation.*;

import spkqnllgang.bibliotheque.Entity.Livre;
import spkqnllgang.bibliotheque.Repository.LivreRepository;

@RestController
@RequestMapping(path = "/livre")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LivreController {
    @Autowired
    private LivreRepository livreRepository;

    @GetMapping
    public Iterable<Livre> getLivres(){
        return livreRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Livre> getLivre(@PathVariable("id") int id){
        return livreRepository.findById(id);
    }
    @GetMapping("/search/{titre}")
    public Set<Livre> findLivreByTitre(@PathVariable("titre") String titre){
        return livreRepository.findLivreByTitre(titre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLivreById(@PathVariable("id") int id){
        livreRepository.deleteById(id);
    }

    @PostMapping("/add")
    public void addLivre(@RequestBody Livre livre) {
        livreRepository.save(livre);
    }

    @PutMapping("/update/{id}")
    public void updateLivre(@PathVariable("id") int id, @RequestBody Livre livre) {
        Optional<Livre> livreData = livreRepository.findById(id);
        
        if(livreData.isPresent()) {
            Livre liv = livreData.get();
            liv.setTitre(livre.getTitre());
            liv.setDateofpublication(livre.getDateofpublication());
            liv.setIsBorrowed(livre.getIsBorrowed());
            liv.setAuteurs(livre.getAuteurs());
        }
    }

}