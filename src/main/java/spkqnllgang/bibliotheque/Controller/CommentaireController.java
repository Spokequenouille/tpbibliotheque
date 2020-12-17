package spkqnllgang.bibliotheque.Controller;


import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spkqnllgang.bibliotheque.Entity.Commentaire;
import spkqnllgang.bibliotheque.Repository.CommentaireRepository;

@RestController
@RequestMapping(path = "/commentaire")
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

    @DeleteMapping("/delete/{id}")
    public void deleteCommentaireById(@PathVariable("id") int id){
        commentaireRepository.deleteById(id);
    }
}
