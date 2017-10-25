package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Division
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DivisionId")
    private Integer id;

    @Version
    private Integer version;

    @OneToMany
    @JoinColumn(name = "DivisionId")
    private Team team;
}
