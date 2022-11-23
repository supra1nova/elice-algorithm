import java.util.Scanner;

public class week1_2팰린드롬문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int strSize = sentence.length();
        int halfNum = strSize%2 != 0 ? strSize/2 : strSize/2-1;

    }
}
