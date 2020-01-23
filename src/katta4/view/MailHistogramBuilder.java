package katta4.view;

import java.util.List;
import katta4.model.Histogram;
import katta4.model.Mail;

public class MailHistogramBuilder {
    

    public static Histogram<String> build(List<Mail> mailList){
       Histogram<String> histogram = new Histogram();       
       
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
       
        return histogram;
    }
}
