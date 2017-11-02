package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.Record;
import com.astontech.nfl.comastontechnfl.repositories.RecordRepository;
import com.astontech.nfl.comastontechnfl.services.RecordService;
import com.astontech.nfl.comastontechnfl.services.impl.RecordImpl;
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

public class RecordImplTests
{
    private final static Integer Record_Id = 1;
    private Record savedRecord = new Record();
    private List<Record> savedRecordList = new ArrayList<>();
    private Record newRecord;
    private List<Record> newRecordList;

    private RecordRepository recordRepository = mock(RecordRepository.class);
    private RecordService recordService = new RecordImpl(recordRepository);

    @Before
    public void setUp()
    {
        newRecord = new Record();
        newRecordList = new ArrayList<>();

        newRecord.setId(1);
        newRecordList.add(newRecord);

        when(recordRepository.findOne(Record_Id)).thenReturn(newRecord);
        when(recordRepository.findAll()).thenReturn(newRecordList);
        when(recordRepository.save(savedRecord)).thenReturn(newRecord);
        when(recordRepository.save(savedRecordList)).thenReturn(newRecordList);
        doThrow(new IllegalArgumentException()).when(recordRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newRecord, recordService.getRecordById(Record_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newRecordList, recordService.listAllRecords());
    }

    @Test
    public void test_save()
    {
        assertEquals(newRecord, recordService.saveRecord(savedRecord));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newRecordList, recordService.saveRecordList(savedRecordList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(recordService.deleteRecord(1));
        assertFalse(recordService.deleteRecord(2));
    }
}