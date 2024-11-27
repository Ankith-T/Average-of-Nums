import java.util.Scanner;
public class NumAvg {
    public static void main(String[] args) throws Exception {
        Scanner numInputScanner = new Scanner(System.in);
        System.out.println("Enter ten numbers to recieve an average: ");
        double tenNums[] = new double[10];
        for (int i=0; i<10; i++){
            tenNums[i] = numInputScanner.nextDouble();
        }
        
        System.out.println("Average of numbers is: " + average(tenNums)); 
        numInputScanner.close();
    }
   public static int average(int[] array){;  
    
    int sum = 0;
    for (int ints : array) {
        sum += ints;
       } 
       return sum/10;

  }
public static double average(double[] array){
    double sumD = 0;
    for (double intD : array) {
        sumD += intD;
    }
    return sumD/10;
 }
}
