package spkqnllgang.bibliotheque.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Commentaire;

@RepositoryRestResource(path="commentaire")
public interface CommentaireRepository extends JpaRepository<Commentaire, Integer>{
    void deleteCommentaireById(int id);
    Set<Commentaire> findCommentaireByText(String text);
}