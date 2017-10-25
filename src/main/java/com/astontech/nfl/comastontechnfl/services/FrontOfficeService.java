package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.FrontOffice;

public interface FrontOfficeService
{
    FrontOffice getFrontOfficeById(Integer id);
    FrontOffice saveFrontOffice(FrontOffice frontOffice);
    Iterable<FrontOffice> listAllFrontOffices();
    Iterable<FrontOffice> saveFrontOfficeList(Iterable<FrontOffice> frontOffices);
    boolean deleteFrontOffice(Integer id);
}
