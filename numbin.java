package binsear;
import java.util.*;
public class numbin {
	public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("enter the no to check:");
        int a = st.nextInt();
        int c = 0, p = 0;
        int r = 0;
        while (a > 0) {
            if ((a % 10 == 0) || (a % 10 == 1)) {
                c++;
            }
            r++;
            a = a / 10;
        }
        if (c == r) {
            System.out.println(" number is a Binary Number.");
        } else {
            System.out.println("number is not a Binary Number");
        }

    }

}
