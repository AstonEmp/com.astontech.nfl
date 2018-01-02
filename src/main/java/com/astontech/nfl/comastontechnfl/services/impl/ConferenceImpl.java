package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.Conference;
import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.repositories.ConferenceRepository;
import com.astontech.nfl.comastontechnfl.services.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenceImpl implements ConferenceService
{
    private final ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceImpl(ConferenceRepository conferenceRepository)
    {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return conferenceRepository.findOne(id);
    }

    @Override
    public Conference saveConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    @Override
    public Iterable<Conference> listAllConferences() {
        return conferenceRepository.findAll();
    }

    @Override
    public Iterable<Conference> saveConferenceList(Iterable<Conference> conferences) {
        return conferenceRepository.save(conferences);
    }

    @Override
    public boolean deleteConference(Integer id) {
        try
        {
            conferenceRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
