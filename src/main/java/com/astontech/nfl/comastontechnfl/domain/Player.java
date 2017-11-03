package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PlayerId")
    private Integer id;

    @Version
    private Integer version;

    private String firstName;

    private String lastName;

    private String position;

    private int rookieSeason;

    private String lastSeason;

}
