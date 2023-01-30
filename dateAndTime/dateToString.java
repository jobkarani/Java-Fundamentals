// converting to string using the DateTimeFormatter 
package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateToString{
    public static void main(String [] args){
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2023-01-31

        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(today.format(usDateFormat)); // 01-31-2023
    }
}