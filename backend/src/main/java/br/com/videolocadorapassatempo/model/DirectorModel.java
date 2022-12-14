package br.com.videolocadorapassatempo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "director")
@Getter
@Setter
@NoArgsConstructor
public class DirectorModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_director")
    @SequenceGenerator(name = "sequence_director", sequenceName = "sequence_director", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

}
