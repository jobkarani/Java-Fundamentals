// Calc engine with WORD and NUMBER support (trenslates numeric values appropriately)
// running the code on the terminal/commandline use e.g: *** java CalcEngineWordAndNumber.java interactive *** // when 2022-12-25 37  OR  multiply five 35//  

package dateAndTime;
import java.time.LocalDate;
import java.util.Scanner;

public class CalcEngineWordAndNumber{
    public static void main( String [] args) {
        double [] leftVals = {10.0d, 20.0d, 30.0d, 40.0d};
        double [] rightVals = {5.0d, 15.0d, 25.0d, 25.0d};
        char [] opCodes = {'d', 'a', 's', 'm'};
        double [] results = new double[opCodes.length];

        if(args.length == 0){
            for(int i = 0; i<opCodes.length; i++){
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            
            for(double currentResults:results)
                System.out.println(currentResults);
        }
        else if(args.length == 1 && args[0].equals("interactive")){
            executeInteractively();
        }
        else if(args.length == 3){
            handleCommandLine(args);
        }
        else{
            System.out.println("Please provide an operation code and 2 numeric values!!");
        }
    }

    static void executeInteractively(){
        System.out.println("Please enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodesFromString(parts[0]);
        if( opCode == 'w'){
            handleWhen(parts);
        }
        else{
            double leftVals = valueFromWord(parts[1]);
            double rightVals = valueFromWord(parts[2]);
            double results =  execute(opCode, leftVals, rightVals);
            displayResult(opCode, leftVals, rightVals, results);
        }
    }

    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);

        String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);
    }

    private static void displayResult(char opCode, double leftVals, double rightVals, double results) {
        char symbol = symbolFromOpcodes(opCode);
        

        String output = String.format("%f %c %f = %f", leftVals, symbol, rightVals, results);
        System.out.println(output);

        // using the decimal flag (3 dp)
        String outputs = String.format("%.3f %c %.3f = %.3f", leftVals, symbol, rightVals, results);
        System.out.println(outputs);
    }

    public static char symbolFromOpcodes(char opCodes){
        char[] opCode = {'d', 'a', 's', 'm'};
        char[] symbols = {'/', '+', '-', '*'};
        char symbol = ' ';
        for(int index = 0; index < opCode.length; index++){
            if(opCodes == opCode[index]){
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandLine(String[] args) {
        char opCodes = args[0].charAt(0); // converts the string respresentation of a character into the character representation of a character
        double leftVals = Double.parseDouble(args[1]); // converts the string representaion of a number and converts it into a double
        double rightVals = Double.parseDouble(args[2]);

        double results = execute(opCodes, leftVals, rightVals);
        System.out.println(results);
    }

    static double execute(char opCodes,  double leftVals, double rightVals){
        double results;
        switch(opCodes){
            case 'a':
                results = leftVals + rightVals;
            break;

            case 's':
                results = leftVals - rightVals;
            break;

            case 'm':
                results = leftVals * rightVals;
            break;

            case 'd':
                results = rightVals != 0 ? leftVals / rightVals : 0.0d;
            break;

            default:
                System.out.println("Invalid  opcode: " + opCodes);
                results = 0.0d;
                break;
        }
        return results;
    }

    static char opCodesFromString(String operationName){
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word){
        String [] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        double value = -1d;
        for(int index = 0; index < numberWords.length; index ++){
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        if(value == -1d){
            value = Double.parseDouble(word);
        }

        return value;
    }

}
