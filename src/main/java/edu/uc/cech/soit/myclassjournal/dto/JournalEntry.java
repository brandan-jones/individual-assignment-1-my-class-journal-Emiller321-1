package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

public @Data
class JournalEntry {

    private int journalID;
    private String name;
    private String date;
    private String description;

    public String getJournalEntry() {
        return null;
    }

    public void setNotes(String notes) {
    }

    public String getNotes() {
        return null;
    }
}