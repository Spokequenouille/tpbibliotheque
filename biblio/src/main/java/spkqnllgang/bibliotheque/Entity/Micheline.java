package spkqnllgang.bibliotheque.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.*;
import java.util.List;

@Data
@Entity
@Getter
@Setter
public class Micheline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int age;

    @OneToMany
    @JoinColumn(name = "micheline_id")
    @Size(min=0,max=3)
    private List<Livre> livres;

    @OneToMany
    @JoinColumn(name = "micheline_id")
    private List<Commentaire> commentaires;



    public void addLivre(Livre livre) {
        if (livre.getIsBorrowed() == false ) {
            livre.setIsBorrowed(true);
            livres.add(livre);
        }
    }
}