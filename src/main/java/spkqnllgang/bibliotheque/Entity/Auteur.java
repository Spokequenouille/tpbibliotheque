package spkqnllgang.bibliotheque.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(name = "Date_Of_Birth", nullable = false)
    private Date dateOfBirth; 

    public Auteur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setAdresse(String nom) {
        this.nom = nom;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDataOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}