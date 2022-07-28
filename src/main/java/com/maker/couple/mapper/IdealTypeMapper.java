package com.maker.couple.mapper;

import com.maker.couple.domain.IdealType;
import com.maker.couple.dto.IdealTypeDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IdealTypeMapper {

    IdealTypeMapper INSTANCE = Mappers.getMapper(IdealTypeMapper.class);
    @Mapping(target = "member", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    List<IdealType> dtoListMapping(List<IdealTypeDTO> dto);
}
