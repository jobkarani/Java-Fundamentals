// Calc engine with command-lin-arguments
// running the code on the terminal/commandline use e.g: *** java CalcEngineWithCLA.java a 20 30 *** OR *** java CalcEngineWithCLA.java d 200 50 *** 

package methods;
public class CalcEngineWithCLA{
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
        else if(args.length == 3){
            handleCommandLine(args);
        }
        else{
            System.out.println("Please provide an operation code and 2 numeric values!!");
        }

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
}
