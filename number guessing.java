import java.util.*;
public class Main
{
    public static void main(String[] args)
    {


        Random randomNum = new Random();
        int showMe = randomNum. nextInt(100);
        System.out.println("Choose Number between1 to 100 :(you can try 10 times)");
        int k = 10;
        int count =0;
        while(k>0){

            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            if(a==showMe){
                System.out.println("Your guess is correct and you take "+(10-k+1)+" steps");
                break;
            }
            else if(a<showMe) {
                System.out.println("Your guess is low and you have "+(k-1)+" tries left");
            }
            else{
                System.out.println("Your guess is high "+(k-1)+" tries left");
            }
            k--;

        }

    }
}