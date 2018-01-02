package com.astontech.nfl.comastontechnfl.rest;

import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.services.DivisionService;
import com.astontech.nfl.comastontechnfl.services.DivisionService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@Log4j
@RestController
@RequestMapping("/api/division")
public class DivisionRest
{
    private DivisionService divisionService;

    @Autowired
    public DivisionRest(DivisionService divisionService)
    {
        this.divisionService = divisionService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Division> getAll()
    {
        return divisionService.listAllDivisions();
    }

    @GetMapping("/{id}")
    public Division getDivision(@PathVariable Integer id)
    {
        return divisionService.getDivisionById(id);
    }

    @PostMapping("/")
    public Division saveDivision(@RequestBody Division division)
    {
        return divisionService.saveDivision(division);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteDivision(@PathVariable Integer id)
    {
        boolean success = false;
        try
        {
            divisionService.deleteDivision(id);
            success = true;
        }
        catch (Exception e)
        {
            log.error(e);
        }

        return success;
    }
}
