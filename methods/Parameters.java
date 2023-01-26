package methods;
public class Parameters{
    public static void main(String [] args){
        showSum(2.5f, 5.5f, 4);
        showSum(100.0f, 20.3f, 3);
    }

    static void showSum(float x, float y, int count){
        float sum = x + y;

        for(int i = 0; i<count; i++){
            System.out.println(sum);
        }
    }
}