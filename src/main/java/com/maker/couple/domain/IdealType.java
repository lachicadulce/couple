package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class IdealType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ideal_type_key")
    private String idealTypeKey;

    @Column(name = "ideal_type_value")
    private String idealTypeValue;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
