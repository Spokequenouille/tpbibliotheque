package spkqnllgang.bibliotheque.Entity;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.*;
import java.util.List;

@Data
@Entity
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
    private List<Livre> livres;

    @OneToMany
    @JoinColumn(name = "micheline_id")
    private List<Commentaire> commentaires;
}