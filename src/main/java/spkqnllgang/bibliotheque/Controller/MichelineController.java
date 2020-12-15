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

import spkqnllgang.bibliotheque.Entity.Micheline;
import spkqnllgang.bibliotheque.Repository.MichelineRepository;

@RestController
@RequestMapping(path = "/micheline")
public class MichelineController {
    @Autowired
    private MichelineRepository michelineRepository;


    @GetMapping
    public Iterable<Micheline> getMicheline(){
        return michelineRepository.findAll();
    }

    @GetMapping("/search/{nom}")
    public Set<Micheline> findMichelineByNom(@PathVariable("nom") String nom){
        return michelineRepository.findMichelineByNom(nom);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMichelineById(@PathVariable("id") int id){
        michelineRepository.deleteById(id);
    }
}