import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFinder{

    public static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args){
        int i = 0;
        while (numbers.size() < 50){
            if (IsPrime(i)){
                numbers.add(i);
            }
            i++;
        }

        for (int x = 0; x < numbers.size(); x++){
            System.out.println(numbers.get(x));
        }
    }

    public static Boolean IsPrime(int n)
    {
        if (n == 2 || n == 3){
            return true;
        }
        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
        {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
            {
                return false;
            }
        }

        return true;
    }
}


