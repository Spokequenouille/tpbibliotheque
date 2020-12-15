package spkqnllgang.bibliotheque.Entity;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.*;

@Entity
@Getter
@Setter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(nullable = false)
    private String nom;

    @ManyToMany(mappedBy = "genres")
    private List<Livre> livres = new ArrayList<Livre>();

}
