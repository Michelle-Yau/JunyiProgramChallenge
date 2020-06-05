import java.util.*;
public class Question1 {

    public static String flip(String s) {
        String result = "";
        String temp;

        if (s.length() == 1 || s.length() == 0) {
            return s;
        } else {


            String[] sarray = s.split(" ");
            for (int i = 0; i < sarray.length; i++) {
                temp = new StringBuilder(sarray[i]).reverse().toString();
                result += temp;
                result += " ";

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(flip("i am michelle"));
    }
}
