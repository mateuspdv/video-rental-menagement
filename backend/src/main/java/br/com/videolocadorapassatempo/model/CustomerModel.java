package br.com.videolocadorapassatempo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_customer")
    @SequenceGenerator(name = "sequence_customer", sequenceName = "sequence_customer", allocationSize = 1)
    private Long id;

    @Column(name = "registration_number", nullable = false)
    private Long registrationNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "gender", nullable = false)
    private Character gender;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "telephone", nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "customerModel", fetch = FetchType.EAGER)
    private List<DependentModel> dependentModel = new ArrayList<>();

}
