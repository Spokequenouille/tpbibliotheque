package spkqnllgang.bibliotheque.Repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Categorie;

@RepositoryRestResource(path="categorie")
public interface CategorieRepository extends JpaRepository<Categorie, Integer>{
    void deleteCategorieById(int id);
    Set<Categorie> findCategorieByNom(String nom);
}
