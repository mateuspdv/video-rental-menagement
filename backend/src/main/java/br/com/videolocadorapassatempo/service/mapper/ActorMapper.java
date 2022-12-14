package br.com.videolocadorapassatempo.service.mapper;

import br.com.videolocadorapassatempo.model.ActorModel;
import br.com.videolocadorapassatempo.service.dto.ActorDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActorMapper extends EntityMapper<ActorDto, ActorModel>{

}
