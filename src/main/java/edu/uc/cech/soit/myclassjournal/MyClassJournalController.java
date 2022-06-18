package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class MyClassJournalController {

    @Qualifier("IJournalService")
    @Autowired
    IJournalService journalService;
    private JournalEntry JournalEntry;

    @RequestMapping("/")
    public String start() {return "start";}

}
