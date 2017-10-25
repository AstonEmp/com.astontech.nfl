package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.Record;

public interface RecordService {
    Record getRecordById(Integer id);
    Record saveRecord(Record record);
    Iterable<Record> listAllRecords();
    Iterable<Record> saveRecordList(Iterable<Record> records);
    boolean deleteRecord(Integer id);
}
