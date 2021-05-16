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

import spkqnllgang.bibliotheque.Entity.Micheline;
import spkqnllgang.bibliotheque.Repository.MichelineRepository;

@RestController
@RequestMapping(path = "/micheline")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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

    @PostMapping("/add")
    public void addMicheline(@RequestBody Micheline micheline) {
        michelineRepository.save(micheline);
    }

    @PutMapping("/update/{id}")
    public void updateMicheline(@PathVariable("id") int id, @RequestBody Micheline micheline) {
        Optional<Micheline> michelineData = michelineRepository.findById(id);
        
        if(michelineData.isPresent()) {
            Micheline mich = michelineData.get();
            mich.setNom(micheline.getNom());
            mich.setAge(micheline.getAge());
            mich.setLivres(micheline.getLivres());
            mich.setCommentaires(micheline.getCommentaires());
        }
    }

}