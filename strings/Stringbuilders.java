package strings;
public class Stringbuilders{
    public static void main(String [] args){
        String location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on flight #");
        sb.append(flightNumber);

        String message = sb.toString(); 
        System.out.println(message); // "I flew to Florida on flight #175"

        String time = "9:00 ";
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at");
        sb.insert(pos + 4, time);

        message = sb.toString(); 
        System.out.println(message); // "I flew to Florida at 9:00 on flight #175"
        
    }
}