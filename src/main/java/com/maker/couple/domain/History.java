package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "member_id_to")
    private Member memberTo;

    @ManyToOne
    @JoinColumn(name = "member_id_from")
    private Member memberFrom;

    @Temporal(value = TemporalType.DATE)
    private Date applicationDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        requested,
        accomplished,
        rejected
    }
}
