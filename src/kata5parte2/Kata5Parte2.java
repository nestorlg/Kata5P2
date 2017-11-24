/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5parte2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5parte2.model.Histogram;
import kata5parte2.model.Mail;
import kata5parte2.view.HistogramDisplay;
import kata5parte2.view.MailHistogramBuilder;
import kata5parte2.view.MailListReader;

/**
 *
 * @author usuario
 */
public class Kata5Parte2 {
    public static void main (String[] arg) throws FileNotFoundException, IOException {
        String filename = "emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay<String> histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}