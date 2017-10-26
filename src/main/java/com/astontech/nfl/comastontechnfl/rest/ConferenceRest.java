package com.astontech.nfl.comastontechnfl.rest;

import com.astontech.nfl.comastontechnfl.domain.Conference;
import com.astontech.nfl.comastontechnfl.services.ConferenceService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j
@RestController
@RequestMapping("/api/conference")
public class ConferenceRest
{
    private ConferenceService conferenceService;

    @Autowired
    public ConferenceRest(ConferenceService conferenceService)
    {
        this.conferenceService = conferenceService;
    }

    @GetMapping("/")
    public Iterable<Conference> getAll()
    {
        return conferenceService.listAllConferences();
    }

    @GetMapping("/{id}")
    public Conference getConference(@PathVariable Integer id)
    {
        return conferenceService.getConferenceById(id);
    }

    @PostMapping("/")
    public Conference saveConference(@RequestBody Conference conference)
    {
        return conferenceService.saveConference(conference);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteConference(@PathVariable Integer id)
    {
        boolean success = false;
        try
        {
            conferenceService.deleteConference(id);
            success = true;
        }
        catch (Exception e)
        {
            log.error(e);
        }

        return success;
    }
}
