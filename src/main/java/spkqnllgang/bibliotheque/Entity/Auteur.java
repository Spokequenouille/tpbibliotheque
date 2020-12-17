package spkqnllgang.bibliotheque.Entity;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
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
    @JsonIgnoreProperties("auteurs")
    private List<Livre> livres= new ArrayList<>();
}


