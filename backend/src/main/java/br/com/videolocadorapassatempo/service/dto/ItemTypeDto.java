package br.com.videolocadorapassatempo.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ItemTypeDto implements Serializable {

    private Long id;

    private String name;

}
