package katta4.main;

import java.util.List;
import katta4.model.Histogram;
import katta4.model.Mail;
import katta4.view.HistogramDisplay;
import katta4.view.MailHistogramBuilder;
import katta4.view.MailListReader;

public class Katta4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);                       
        Histogram histogram = MailHistogramBuilder.build(mailList);                  
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
