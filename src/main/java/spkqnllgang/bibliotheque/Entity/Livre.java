package spkqnllgang.bibliotheque.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;
import java.util.Set;

import lombok.*;

@Data
@Entity
@NoArgsConstructor
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private int id;
    @Column(nullable = false)
    private String titre;
    @Column(name = "Date_Of_Publication", nullable = false)
    private Date dateofpublication; 

    @ManyToMany
    @JoinTable(
            name = "livre_genre",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id")
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties("livre_genre")
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(
            name = "livre_auteur",
            joinColumns = @JoinColumn(name = "auteur_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id")
    )
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties("livre_auteur")
    private List<Auteur> auteurs;
}