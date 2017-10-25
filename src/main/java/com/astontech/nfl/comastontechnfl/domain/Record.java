package com.astontech.nfl.comastontechnfl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Record
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RecordId")
    private Integer id;

    @Version
    private Integer version;

    private byte wins;

    private byte losses;

    private byte ties;

    private String seasonSpan;

}
