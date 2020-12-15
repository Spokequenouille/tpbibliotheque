package spkqnllgang.bibliotheque.Entity;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import java.util.List;
import lombok.*;

@Data
@Entity
@Getter
@Setter
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(name = "Date_Of_Birth", nullable = false)
    private Date dateOfBirth; 

    @ManyToMany(mappedBy = "auteurs")
    private List<Livre> livres = new ArrayList<Livre>();
}