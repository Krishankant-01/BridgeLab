package bridgelab.twojuly;
import java.util.Scanner;
public class sumandavg {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

       
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

      
        int  avg = (int ) sum / n;

    
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

    

