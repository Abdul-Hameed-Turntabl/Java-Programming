package Lab1;
import java.util.concurrent.ThreadLocalRandom;

public class Lab1 {

    static  void Q3PrintName(int num)
    {
        String[] strings = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(num > 9 || num < 0)
            return;
        System.out.println(num + " ---> " + strings[num]);
    }

    static void Q4StopZero()
    {
        int irand = 0;
        do{

            irand = ThreadLocalRandom.current().nextInt(-3,3);
            System.out.println("[+] Random number: " + irand);

        } while(irand != 0);
    }

    static void Q5MultTable()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("[+] ----- begin " + i + " timestable ----- [+] \n");
            for(int j = 1; j <= 12; j++)
                System.out.println(i + " x " + j + " = " + i*j);
            System.out.println("[+] ----- end   " + i + " timestable ----- [+]\n");
        }
    }

    static void Q6PrintRandom(int bound)
    {
        int i = 6;
        while(i-- > 0)
            System.out.println("[+] Random number: " + ThreadLocalRandom.current().nextInt(1,bound));
    }

    public static void main(String[] args) {
        var irand = ThreadLocalRandom.current().nextInt(9);
        System.out.println("\n[Lab1]\n\n" + irand);

        if(irand % 2 == 0)
            System.out.println("[+] Its even");
        else
            System.out.println("[-] Its odd");
        Q3PrintName(irand);
        Q4StopZero();
        Q5MultTable();
        Q6PrintRandom(100);
    }
}
