// working with parallel arrays 
// for this versions working code checkout the **FOREACH FOLDER**

package arrays;
public class CalcEngine{
    public static void main( String [] args) {
        double [] leftVals = {10.0d, 20.0d, 30.0d, 40.0d};
        double [] rightVals = {5.0d, 15.0d, 25.0d, 25.0d};
        char [] opCodes = {'d', 'a', 's', 'm'};
        double [] results = new double[opCodes.length];

        for(int i = 0; i<opCodes.length; i++){
            switch(opCodes[i]){
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                break;

                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                break;

                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                break;

                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                break;

                default:
                    System.out.println("Invalid opcode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }
        System.out.println(results);
    }
}
