package methods;
public class CommandLineArguments{
    public static void main(String [] args){
        if (args.length < 1){
            System.out.println("No args provided!!");
        }
        else{
            for(String arg:args){
                System.out.println(arg);
            }
        }
    }
}