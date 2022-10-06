import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeTask2{

    static int [] numbers = {99,84,70,112,138,157,22,171,124,90,102,191,184,93,140,22,8,15,101,124,51,129,165,60,67,88,123,97,101,188,40,106,56,55,94,87,89,97,86,66,135,170,113,20,199,89,198,29,168,28};
    static List<Integer> numbersSorted = new ArrayList<Integer>();

    public static void main(String[] args){
        while (numbersSorted.size() < 50){
            numbersSorted.add(0);
            for (int i = 0; i < 50; i++){
                if (numbersSorted.get(numbersSorted.size() - 1) < numbers[i]){
                    numbersSorted.set(numbersSorted.size() - 1, numbers[i]);
                }
            }
        }

        for (int x = 0; x < numbersSorted.size(); x++){
            System.out.println(numbersSorted.get(x));
        }
    }
}


