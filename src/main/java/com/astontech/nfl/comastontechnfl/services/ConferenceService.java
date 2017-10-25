package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.Conference;

public interface ConferenceService
{
    Conference getConferenceById(Integer id);
    Conference saveConference(Conference conference);
    Iterable<Conference> listAllConferences();
    Iterable<Conference> saveConferenceList(Iterable<Conference> conferences);
    boolean deleteConference(Integer id);
}
