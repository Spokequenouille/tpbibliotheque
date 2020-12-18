package spkqnllgang.bibliotheque.Repository;

import java.util.Set;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Micheline;

@RepositoryRestResource(path="micheline")
public interface MichelineRepository extends JpaRepository<Micheline, Integer>{
	Set<Micheline> findMichelineByNom(String nom);
	void deleteMichelineById(int id);
}
