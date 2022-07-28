package com.maker.couple.controller;

import com.maker.couple.domain.IdealType;
import com.maker.couple.domain.Member;
import com.maker.couple.dto.IdealTypeDTO;
import com.maker.couple.dto.MemberDTO;
import com.maker.couple.mapper.IdealTypeMapper;
import com.maker.couple.mapper.MemberMapper;
import com.maker.couple.service.IdealTypeService;
import com.maker.couple.service.MemberService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    IdealTypeService idealTypeService;

    @GetMapping
    public List<Member> members(){
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findById(id);
    }

    @PostMapping
    public Member insertMember(@RequestBody MemberDTO dto){
        MemberMapper mapper = Mappers.getMapper(MemberMapper.class);
        IdealTypeMapper mapper2 = Mappers.getMapper(IdealTypeMapper.class);

        Member member = memberService.save(mapper.mappingMember(dto, new Member()));

        // TODO:
        //List<IdealType> idealTypes = mapper2.dtoListMapping(dto.getIdealTypes());
        //idealTypes.stream().forEach();
        return new Member();
    }
}
