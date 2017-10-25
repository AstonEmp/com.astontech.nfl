package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Conference
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ConferenceId")
    private Integer id;

    @Version
    private Integer version;

    @OneToMany
    @JoinColumn(name = "ConferenceId")
    private Division division;

    private String conferenceName;

}
