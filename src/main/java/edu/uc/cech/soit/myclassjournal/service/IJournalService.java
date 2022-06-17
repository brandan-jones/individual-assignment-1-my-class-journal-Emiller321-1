package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Journal Service handles business logic for Journal DTOs.
 */
@Service
public interface IJournalService {
    /**
     * Save a new Journal Entry
     * @param journalEntry the entry to save.
     */

    JournalEntry fetchByJournalEntry(int journalEntry);
    void delete(int journalEntry) throws Exception;

    JournalEntry save(JournalEntry journalEntry) throws Exception;

    /**
     * Return all journal entries.
     *
     * @return a collection of all journal entries.
     */
    List<JournalEntry> fetchAll();
}
