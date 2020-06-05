import java.util.Scanner;
public class Question2 {

    public static int count(int num) {
        int total = 0;
        if (num <= 0) {
            return 0;
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    total++;
                    //System.out.println(i);
                } else if (i % 5 == 0) {
                    continue;
                } else if (i % 3 == 0) {
                    continue;
                } else {
                    total++;
                    //System.out.println(i);
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(count(15));
    }
}
