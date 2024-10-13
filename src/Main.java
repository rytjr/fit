import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long num = sc.nextLong();
        if(num <= 1000000000 && num > 0) {
            System.out.print(num*4);
        }
        else {
            System.out.print("");
        }

    }
}