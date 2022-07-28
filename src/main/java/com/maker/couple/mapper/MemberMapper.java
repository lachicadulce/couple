package com.maker.couple.mapper;

import com.maker.couple.domain.Member;
import com.maker.couple.dto.MemberDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idealTypes", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Member mappingMember(MemberDTO dto, @MappingTarget Member member);
}
