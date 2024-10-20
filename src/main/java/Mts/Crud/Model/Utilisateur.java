package Mts.Crud.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends EntiteAbstraite {

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  @Column(name = "email")
  private String email;

  @Column(name = "datedenaissance")
  private LocalDate dateDeNaissance;

  @Column(name = "motdepasse")
  private String moteDePasse;

  @Embedded
  private Adresse adresse;

  @Column(name = "photo")
  private String photo;

  @ManyToOne
  @JoinColumn(name = "identreprise")
  private Entreprise entreprise;


  @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
  @JsonIgnore
  private List<Roles> roles;

}
