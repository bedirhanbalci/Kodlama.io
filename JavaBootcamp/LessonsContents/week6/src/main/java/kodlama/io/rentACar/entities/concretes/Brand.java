package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "brands")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}