package com.maker.couple.dto;

import com.maker.couple.domain.IdealType;
import com.maker.couple.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDTO {

    String name;

    Member.Sex sex;

    Date birth;

    Member.Job job;

    int height;

    int weight;

    List<IdealType> idealTypes;
}
