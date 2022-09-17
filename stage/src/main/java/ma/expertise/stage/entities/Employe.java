package ma.expertise.stage.entities;

import javax.persistence.*;
import java.util.Date;

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String role;
    private int score;
}

}
