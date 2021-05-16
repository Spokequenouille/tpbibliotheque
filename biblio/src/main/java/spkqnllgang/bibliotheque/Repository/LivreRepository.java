package spkqnllgang.bibliotheque.Repository;

import java.util.Set;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Livre;

@RepositoryRestResource(path="livre")
public interface LivreRepository extends JpaRepository<Livre, Integer>{
	Set<Livre> findLivreByTitre(String titre);
	Set<Livre> findLivreByDateofpublication(Date Date_Of_Publication);
	void deleteLivreById(int id);
}
