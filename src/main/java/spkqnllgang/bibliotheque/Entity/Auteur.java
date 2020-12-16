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

import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.*;

@Data
@Entity
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
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties
    private List<Livre> livres;
}