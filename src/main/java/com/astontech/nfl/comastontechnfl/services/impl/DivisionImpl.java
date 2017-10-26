package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.repositories.DivisionRepository;
import com.astontech.nfl.comastontechnfl.services.DivisionService;
import org.springframework.stereotype.Service;

@Service
public class DivisionImpl implements DivisionService
{
    private final DivisionRepository divisionRepository;

    public DivisionImpl(DivisionRepository divisionRepository)
    {
        this.divisionRepository = divisionRepository;
    }

    @Override
    public Division getDivisionById(Integer id) {
        return divisionRepository.findOne(id);
    }

    @Override
    public Division saveDivision(Division division) {
        return divisionRepository.save(division);
    }

    @Override
    public Iterable<Division> listAllDivisions() {
        return divisionRepository.findAll();
    }

    @Override
    public Iterable<Division> saveDivisionList(Iterable<Division> divisions) {
        return divisionRepository.save(divisions);
    }

    @Override
    public boolean deleteDivision(Integer id) {
        try
        {
            divisionRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
