package br.com.videolocadorapassatempo.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Serializable {

    private Long id;

    private Long registrationNumber;

    private String name;

    private LocalDate birthDate;

    private Character gender;

    private Boolean active;

    private String cpf;

    private String address;

    private String telephone;

    private String type;

    private Long idMember;

}
