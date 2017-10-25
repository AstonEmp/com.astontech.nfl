package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.Division;

public interface DivisionService
{
    Division getDivisionById(Integer id);
    Division saveDivision(Division division);
    Iterable<Division> listAllDivisions();
    Iterable<Division> saveDivisionList(Iterable<Division> divisions);
    boolean deleteDivision(Integer id);
}
