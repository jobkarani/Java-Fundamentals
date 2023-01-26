package methods;
public class Returning{
    public static void main(String [] args){
        double results = calcurateInterest(100d, 0.05d, 3);
        System.out.println(results);
    }

    static double calcurateInterest(double amt, double rate, int years){
        // double interest = amt * rate * years;
        // return interest;

        return amt * rate * years;
    }

    static double [] produceInterestHistory(double amt, double rate, int years){
        double [] accumulatedInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++){
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calcurateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }
}