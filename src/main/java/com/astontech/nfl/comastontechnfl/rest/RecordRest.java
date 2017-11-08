package com.astontech.nfl.comastontechnfl.rest;

import com.astontech.nfl.comastontechnfl.domain.Record;
import com.astontech.nfl.comastontechnfl.services.RecordService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j
@RestController
@RequestMapping("/api/record")
public class RecordRest
{
    private RecordService recordService;

    @Autowired
    public RecordRest(RecordService recordService)
    {
        this.recordService = recordService;
    }

    @GetMapping("/")
    public Iterable<Record> getAll()
    {
        return recordService.listAllRecords();
    }

    @GetMapping("/{id}")
    public Record getRecord(@PathVariable Integer id)
    {
        return recordService.getRecordById(id);
    }

    @PostMapping("/")
    public Record saveRecord(@RequestBody Record record)
    {
        return recordService.saveRecord(record);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteRecord(@PathVariable Integer id)
    {
        boolean success = false;
        try
        {
            recordService.deleteRecord(id);
            success = true;
        }
        catch (Exception e)
        {
            log.error(e);
        }

        return success;
    }
}
