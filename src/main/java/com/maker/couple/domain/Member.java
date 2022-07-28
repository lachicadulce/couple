package com.maker.couple.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Temporal(value = TemporalType.DATE)
    private Date birth;

    @Enumerated(EnumType.STRING)
    private Job job;

    @CreationTimestamp
    @Temporal(value = TemporalType.DATE)
    @Column(name = "join_date")
    private Date joinDate;

    private int height;

    private int weight;

//    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
//    private List<History> histories;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<IdealType> idealTypes;

    public enum Sex {
        Male,
        Female;
    }

    public enum Job {
        accountant,
        actor,
        ambassador,
        anchor,
        announcer,
        architect,
        astronaut,
        baker,
        bank_clerk,
        bodyguard,
        captain,
        cartoonist,
        chef,
        coach,
        cook,
        cop,
        designer,
        doctor,
        editor,
        engineer,
        farmer,
        firefighter,
        general,
        hotelier,
        interpreter,
        judge,
        lawyer,
        model,
        painter,
        pilot,
        poet,
        president,
        programmer,
        reporter,
        secretary,
        salesman,
        singer,
        stewardess,
        teacher,
        translator,
        writer,
        zoo_keeper
    }
}
