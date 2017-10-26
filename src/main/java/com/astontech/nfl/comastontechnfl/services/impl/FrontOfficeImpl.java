package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.FrontOffice;
import com.astontech.nfl.comastontechnfl.repositories.FrontOfficeRepository;
import com.astontech.nfl.comastontechnfl.services.FrontOfficeService;
import org.springframework.stereotype.Service;

@Service
public class FrontOfficeImpl implements FrontOfficeService
{
    private final FrontOfficeRepository frontOfficeRepository;

    public FrontOfficeImpl(FrontOfficeRepository frontOfficeRepository)
    {
        this.frontOfficeRepository = frontOfficeRepository;
    }

    @Override
    public FrontOffice getFrontOfficeById(Integer id) {
        return frontOfficeRepository.findOne(id);
    }

    @Override
    public FrontOffice saveFrontOffice(FrontOffice frontOffice) {
        return frontOfficeRepository.save(frontOffice);
    }

    @Override
    public Iterable<FrontOffice> listAllFrontOffices() {
        return frontOfficeRepository.findAll();
    }

    @Override
    public Iterable<FrontOffice> saveFrontOfficeList(Iterable<FrontOffice> frontOffices) {
        return frontOfficeRepository.save(frontOffices);
    }

    @Override
    public boolean deleteFrontOffice(Integer id) {
        try
        {
            frontOfficeRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
