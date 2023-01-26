package methods;
public class CalcEngine{
    public static void main( String [] args) {
        double [] leftVals = {10.0d, 20.0d, 30.0d, 40.0d};
        double [] rightVals = {5.0d, 15.0d, 25.0d, 25.0d};
        char [] opCodes = {'d', 'a', 's', 'm'};
        double [] results = new double[opCodes.length];

        for(int i = 0; i<opCodes.length; i++){
            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
        }
        
        for(double currentResults:results)
            System.out.println(currentResults);

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
