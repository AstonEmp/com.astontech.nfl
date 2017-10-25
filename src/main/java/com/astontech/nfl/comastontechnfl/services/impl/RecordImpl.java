package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.Record;
import com.astontech.nfl.comastontechnfl.repositories.RecordRepository;
import com.astontech.nfl.comastontechnfl.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordImpl implements RecordService
{
    private final RecordRepository recordRepository;

    @Autowired
    public RecordImpl(RecordRepository recordRepository)
    {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record getRecordById(Integer id) {
        return recordRepository.findOne(id);
    }

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public Iterable<Record> listAllRecords() {
        return recordRepository.findAll();
    }

    @Override
    public Iterable<Record> saveRecordList(Iterable<Record> records) {
        return recordRepository.save(records);
    }

    @Override
    public boolean deleteRecord(Integer id) {
        try
        {
            recordRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
