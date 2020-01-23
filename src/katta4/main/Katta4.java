package katta4.main;

import java.util.List;
import katta4.model.Histogram;
import katta4.model.Mail;
import katta4.view.HistogramDisplay;
import katta4.view.MailHistogramBuilder;
import katta4.view.MailListReader;

public class Katta4 {
    private String fileName;
    private List<Mail> mailList;
    private Histogram histogram;
    private HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) {
        Katta4 katta4 = new Katta4();
        katta4.execute();
    }

    private void execute(){
        input();
        process();
        output();
    }
    
    private void input() {
        fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);  
    }

    private void output() {
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
