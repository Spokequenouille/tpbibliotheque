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

import spkqnllgang.bibliotheque.Entity.Commentaire;
import spkqnllgang.bibliotheque.Repository.CommentaireRepository;

@RestController
@RequestMapping(path = "/commentaire")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CommentaireController {
    @Autowired
    private CommentaireRepository commentaireRepository;

    @GetMapping
    public Iterable<Commentaire> getCommentaire(){
        return commentaireRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Commentaire> getCommentaire(@PathVariable("id") int id){
        return commentaireRepository.findById(id);
    }

    @GetMapping("/search/{text}")
    public Set<Commentaire> findCommentaireByText(@PathVariable("text") String text){
        return commentaireRepository.findCommentaireByText(text);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentaireById(@PathVariable("id") int id){
        commentaireRepository.deleteById(id);
    }

    @PostMapping("/add")
    public void addCommentaire(@RequestBody Commentaire commentaire) {
        commentaireRepository.save(commentaire);
    }

    @PutMapping("/update/{id}")
    public void updateCommentaire(@PathVariable("id") int id, @RequestBody Commentaire commentaire) {
        Optional<Commentaire> commentaireData = commentaireRepository.findById(id);
        
        if(commentaireData.isPresent()) {
            Commentaire com = commentaireData.get();
            com.setText(commentaire.getText());
        }
    }
}
