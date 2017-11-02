package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.Conference;
import com.astontech.nfl.comastontechnfl.repositories.ConferenceRepository;
import com.astontech.nfl.comastontechnfl.services.ConferenceService;
import com.astontech.nfl.comastontechnfl.services.impl.ConferenceImpl;
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

public class ConferenceImplTests
{
    private final static Integer Conference_Id = 1;
    private Conference savedConference = new Conference();
    private List<Conference> savedConferenceList = new ArrayList<>();
    private Conference newConference;
    private List<Conference> newConferenceList;

    private ConferenceRepository conferenceRepository = mock(ConferenceRepository.class);
    private ConferenceService conferenceService = new ConferenceImpl(conferenceRepository);

    @Before
    public void setUp()
    {
        newConference = new Conference();
        newConferenceList = new ArrayList<>();

        newConference.setId(1);
        newConferenceList.add(newConference);

        when(conferenceRepository.findOne(Conference_Id)).thenReturn(newConference);
        when(conferenceRepository.findAll()).thenReturn(newConferenceList);
        when(conferenceRepository.save(savedConference)).thenReturn(newConference);
        when(conferenceRepository.save(savedConferenceList)).thenReturn(newConferenceList);
        doThrow(new IllegalArgumentException()).when(conferenceRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newConference, conferenceService.getConferenceById(Conference_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newConferenceList, conferenceService.listAllConferences());
    }

    @Test
    public void test_save()
    {
        assertEquals(newConference, conferenceService.saveConference(savedConference));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newConferenceList, conferenceService.saveConferenceList(savedConferenceList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(conferenceService.deleteConference(1));
        assertFalse(conferenceService.deleteConference(2));
    }
}
