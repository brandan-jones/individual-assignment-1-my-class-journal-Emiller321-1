package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class JournalDAOStub implements IJournalDAO {

    Map<Integer, JournalEntry> allJournals = new HashMap<>();

    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
        Integer journalID = Integer.parseInt(journalEntry.getJournalEntry());
        allJournals.put(journalID, journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        List<JournalEntry> returnJournals = new ArrayList(allJournals.values());
                return returnJournals;
    }

    @Override
    public JournalEntry fetch(int journalEntry) {
        return allJournals.get(journalEntry);
    }

    @Override
    public void delete(int id) {
        allJournals.remove(id);
    }
}
