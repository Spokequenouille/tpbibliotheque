package spkqnllgang.bibliotheque.Repository;

import java.util.Set;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spkqnllgang.bibliotheque.Entity.Auteur;

@RepositoryRestResource(path="auteur")
public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
	Set<Auteur> findAuteurByNom(String nom);
	Set<Auteur> findAuteurByDateOfBirth(Date dateOfBirth);
	void deleteAuteurById(int id);

}
