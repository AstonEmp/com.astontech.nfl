package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.FrontOffice;
import com.astontech.nfl.comastontechnfl.repositories.FrontOfficeRepository;
import com.astontech.nfl.comastontechnfl.services.FrontOfficeService;
import com.astontech.nfl.comastontechnfl.services.impl.FrontOfficeImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FrontOfficeImplTests
{
    private final static Integer FrontOffice_Id = 1;
    private FrontOffice savedFrontOffice = new FrontOffice();
    private List<FrontOffice> savedFrontOfficeList = new ArrayList<>();
    private FrontOffice newFrontOffice;
    private List<FrontOffice> newFrontOfficeList;

    private FrontOfficeRepository frontOfficeRepository = mock(FrontOfficeRepository.class);
    private FrontOfficeService frontOfficeService = new FrontOfficeImpl(frontOfficeRepository);

    @Before
    public void setUp()
    {
        newFrontOffice = new FrontOffice();
        newFrontOfficeList = new ArrayList<>();

        newFrontOffice.setId(1);
        newFrontOfficeList.add(newFrontOffice);

        when(frontOfficeRepository.findOne(FrontOffice_Id)).thenReturn(newFrontOffice);
        when(frontOfficeRepository.findAll()).thenReturn(newFrontOfficeList);
        when(frontOfficeRepository.save(savedFrontOffice)).thenReturn(newFrontOffice);
        when(frontOfficeRepository.save(savedFrontOfficeList)).thenReturn(newFrontOfficeList);
        doThrow(new IllegalArgumentException()).when(frontOfficeRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newFrontOffice, frontOfficeService.getFrontOfficeById(FrontOffice_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newFrontOfficeList, frontOfficeService.listAllFrontOffices());
    }

    @Test
    public void test_save()
    {
        assertEquals(newFrontOffice, frontOfficeService.saveFrontOffice(savedFrontOffice));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newFrontOfficeList, frontOfficeService.saveFrontOfficeList(savedFrontOfficeList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(frontOfficeService.deleteFrontOffice(1));
        assertFalse(frontOfficeService.deleteFrontOffice(2));
    }
}