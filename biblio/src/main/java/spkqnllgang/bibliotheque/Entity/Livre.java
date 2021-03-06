package spkqnllgang.bibliotheque.Entity;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.*;

import lombok.*;

@Data
@Entity
@Getter
@Setter
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(nullable = false)
    private String titre;
    @Column(name = "Date_Of_Publication", nullable = false)
    private Date dateofpublication; 
    @Column(columnDefinition = "boolean default false")
    private Boolean isborrowed; 



    @ManyToMany
    @JoinTable(
            name = "livre_auteur",
            joinColumns = @JoinColumn(name = "livre_id"),
            inverseJoinColumns = @JoinColumn(name = "auteur_id")
    )
    @JsonIgnoreProperties("livres")
    private List<Auteur> auteurs;

	public boolean getIsBorrowed() {
		return false;
    }
    
    public void setIsBorrowed(Boolean isborrowed) {
        this.isborrowed = isborrowed;
    }
}