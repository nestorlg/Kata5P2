package kata5parte2.view;

import java.util.List;
import kata5parte2.model.Histogram;
import kata5parte2.model.Mail;


public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo = new Histogram();
        int i = 1;
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain(),i);
            i++;
        }
        return histo;
    }
}