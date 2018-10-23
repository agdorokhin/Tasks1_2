import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CreateCustomList {
    public static void main(String[] args) {
        int minValue;
        int maxValue;
        Scanner s = new Scanner(System.in);
        while (true) try {
            System.out.print("Enter minimum value in a range: ");
            minValue = s.nextInt();
            System.out.print("Enter maximum value in a range: ");
            maxValue = s.nextInt();
            break;
        } catch (InputMismatchException e) {
            s.next();
            System.out.println("Yo've entered invalid data. Try again: ");
        }

        if (maxValue <= minValue + 10) {
            System.out.print("You've specified too small range.");
            System.exit(1);
        }

        int rangeLength=maxValue-minValue+1;
        int[] customList = new int[rangeLength];
        int index=0;
        for (int i=minValue; i<=maxValue; i++) {
            customList[index]=i;
            index++;
        }

        System.out.println("Values added to array: "+Arrays.toString(customList));

        int sum=0;
        for (int j=0; j < customList.length; j++) {
            if (customList[j] % 3 == 0 && customList[j] % 5 != 0) {
                sum=sum+customList[j];
            }
        }

        System.out.print("The sum of values in the array that can be divided by '3' but cannot be divided by '5' is: "+sum);

    }
}
