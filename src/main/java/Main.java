import com.sun.jdi.Value;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static java.rmi.Naming.list;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        String name1="Anton",name2 ="MaX",name3="Kirill";
        for (int i=0;i<10;i++)
            System.out.println("Когда я вырасту, то хочу быть паровым экскаватором!");


























        //цикл с памятью
        int n1 = 1, n2 = 1,sum=0;
        int n = 5;
        int cnt = 0;
        while (cnt < n - 2) {
            sum=n1+n2;
            n1=n2;
            n2=sum;
            cnt++;
        }
        System.out.println(sum);
        System.out.println(func(5));


        for (int i=0;i<n;i++){
            sum = n1+n2;
        }


    }



    //рекурсия
    private static int func(int x) {
        if (x <= 1) return x;
        return func(x - 1) + func(x - 2);
    }


}
