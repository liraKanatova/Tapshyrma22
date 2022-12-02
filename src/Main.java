import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
       ArrayList<Integer> number2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num= random.nextInt(1,100);
            numbers.add(num);
            if (num%2!=0) {
               number1.add(num);
            }else {
               number2.add(num);
            }
        }

        System.out.println(numbers);
        System.out.println(number1);
        System.out.println(number2);


    }}


