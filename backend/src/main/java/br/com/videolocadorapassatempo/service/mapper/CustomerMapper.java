package br.com.videolocadorapassatempo.service.mapper;

import br.com.videolocadorapassatempo.model.CustomerModel;
import br.com.videolocadorapassatempo.service.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DependentMapper.class})
public interface CustomerMapper extends EntityMapper<CustomerDto, CustomerModel>{
}