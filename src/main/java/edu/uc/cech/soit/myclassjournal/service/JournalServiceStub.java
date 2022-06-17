package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JournalServiceStub implements IJournalService{

    @Autowired
    private IJournalDAO journalDAO;
    private JournalEntry journalEntry;

    public JournalServiceStub(){

    }

    public JournalServiceStub( IJournalDAO journalDAO) {

        this.journalDAO = journalDAO;
    }


    @Override
    public JournalEntry fetchByJournalEntry(int journalEntry) {
        JournalEntry foundJournal = journalDAO.fetch(journalEntry);
        return foundJournal;
    }

    @Override
    public void delete(int id) throws Exception{
        journalDAO.delete(id);
    }

    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
        return journalDAO.save(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {

        return journalDAO.fetchAll();
    }

}
