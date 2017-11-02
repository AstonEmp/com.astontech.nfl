package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Team
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TeamId")
    private Integer id;

    @Version
    private Integer version;

    private String teamName;

    private String homeTown;

    @OneToMany
    @JoinColumn(name = "TeamId")
    private List<Record> recordList;

    @OneToOne
    @JoinColumn(name = "TeamId")
    private FrontOffice frontOffice;

    @OneToMany
    @JoinColumn(name = "TeamId")
    private List<Player> playerList;

}
