package spkqnllgang.bibliotheque.Repository;

import java.util.Set;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
}
