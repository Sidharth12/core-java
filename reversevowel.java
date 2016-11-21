package binsear;
import java.util.*;
public class reversevowel {
	public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("enter the string :");
        String a = st.nextLine();
        char w[] = a.toCharArray();
        Character t[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> al = Arrays.asList(t);
        int i = 0;
        int j = w.length - 1;
        while (i < j) {
            if (!al.contains(w[i])) {
                i++;
            }
            if (!al.contains(w[j])) {

                j--;
            }
            char b = w[i];
            w[i] = w[j];
            w[j] = b;
            i++;
            j--;
        }
        System.out.println("modified string is " + new String(w));
    }

}
