package spkqnllgang.bibliotheque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spkqnllgang.bibliotheque.Entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
}
