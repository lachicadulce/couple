package com.maker.couple.service;

import com.maker.couple.domain.IdealType;
import com.maker.couple.domain.Member;
import com.maker.couple.repository.IdealTypeRepository;
import com.maker.couple.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    IdealTypeRepository idealTypeRepository;

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public Member findById(int id){
        return memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

//    public Member save(Member member, IdealType idealType) {
//        Member result = memberRepository.save(member);
//        idealType.setMember(result);
//
//        idealTypeRepository.save(idealType);
//
//        return result;
//    }
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public void delete(int id){
        memberRepository.deleteById(id);
    }
}
