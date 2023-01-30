// Parsing a string with DateTimeFormatter

package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class parsingAString{
    public static void main(String [] args){
        String usDateString = "07-04-2022";
        LocalDate failedDate = LocalDate.parse(usDateString); // ERROR!!!!

        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate theDate = LocalDate.parse(usDateString, usDateFormat); // 07-04-2022
    }
}