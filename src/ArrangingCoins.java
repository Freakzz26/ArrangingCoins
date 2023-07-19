import java.util.Scanner;
public class ArrangingCoins {
    static void arrange(int number)
    {
        int count=0,i=0;
        for (i=0;i<number;i++)
        {
            number=number-1;
            count++;
            i++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        arrange(number);
    }
}
