package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.repositories.DivisionRepository;
import com.astontech.nfl.comastontechnfl.services.DivisionService;
import com.astontech.nfl.comastontechnfl.services.impl.DivisionImpl;
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

public class DivisionImplTests
{
    private final static Integer Division_Id = 1;
    private Division savedDivision = new Division();
    private List<Division> savedDivisionList = new ArrayList<>();
    private Division newDivision;
    private List<Division> newDivisionList;

    private DivisionRepository divisionRepository = mock(DivisionRepository.class);
    private DivisionService divisionService = new DivisionImpl(divisionRepository);

    @Before
    public void setUp()
    {
        newDivision = new Division();
        newDivisionList = new ArrayList<>();

        newDivision.setId(1);
        newDivisionList.add(newDivision);

        when(divisionRepository.findOne(Division_Id)).thenReturn(newDivision);
        when(divisionRepository.findAll()).thenReturn(newDivisionList);
        when(divisionRepository.save(savedDivision)).thenReturn(newDivision);
        when(divisionRepository.save(savedDivisionList)).thenReturn(newDivisionList);
        doThrow(new IllegalArgumentException()).when(divisionRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newDivision, divisionService.getDivisionById(Division_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newDivisionList, divisionService.listAllDivisions());
    }

    @Test
    public void test_save()
    {
        assertEquals(newDivision, divisionService.saveDivision(savedDivision));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newDivisionList, divisionService.saveDivisionList(savedDivisionList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(divisionService.deleteDivision(1));
        assertFalse(divisionService.deleteDivision(2));
    }
}
