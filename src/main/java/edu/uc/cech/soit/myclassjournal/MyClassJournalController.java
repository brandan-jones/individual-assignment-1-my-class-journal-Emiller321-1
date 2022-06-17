package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyClassJournalController {

    @Qualifier("IJournalService")
    @Autowired
    IJournalService journalService;
    private JournalEntry JournalEntry;

    @RequestMapping("/")
    public String start() {return "start";}

    @GetMapping("/journal")
    @ResponseBody
    public List<JournalEntry> fetchAllJournals(){
        return journalService.fetchAll();
    }

    @GetMapping("/journal/{journal-entry}/")
    public ResponseEntity fetchJournalByJournalEntry(@PathVariable("journal-entry") String journalEntry)  {
        JournalEntry foundJournal = journalService.fetchByJournalEntry(Integer.parseInt(journalEntry));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(foundJournal ,headers ,HttpStatus.OK);
    }

    @PostMapping(value="/journal", consumes="application/json", produces="application/json")
    public JournalEntry createJournal(@RequestBody JournalEntry journalEntry) {
        JournalEntry = null;
        try{
             JournalEntry = journalService.save(journalEntry);
        } catch (Exception e){

        }
        return new JournalEntry();
    }

    @DeleteMapping("/journal/{journal-entry}/")
    public ResponseEntity deleteJournal(@PathVariable("journal-entry") String journalEntry){
        try {
            journalService.delete(Integer.parseInt(journalEntry));
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
