package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class FrontOffice
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FrontOfficeId")
    private Integer id;

    @Version
    private Integer version;

    private String owner;

    private String generalManager;

    private String headCoach;
}
