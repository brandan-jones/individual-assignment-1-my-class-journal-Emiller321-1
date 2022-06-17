package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

public interface IJournalDAO {
    JournalEntry save(JournalEntry journal) throws Exception;

    List<JournalEntry> fetchAll();


    JournalEntry fetch(int id);

    void delete(int id);
}
