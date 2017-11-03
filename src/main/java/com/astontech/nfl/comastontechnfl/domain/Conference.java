package com.astontech.nfl.comastontechnfl.domain;

import com.sun.org.apache.xpath.internal.operations.Div;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ConferenceId")
    private List<Division> divisionList;

    private String conferenceName;

}
