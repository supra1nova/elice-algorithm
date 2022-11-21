import java.util.Scanner;
import java.util.regex.Pattern;

public class day_1_2토끼굴탈출 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String next = sc.next();
        String sentence = next.substring(0, x);
        int bigStringCounter = 0;
        int smallStringCounter = 0;
        int numberCounter = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(Pattern.compile("[a-z]").matcher(String.valueOf(sentence.charAt(i))).find()){
                smallStringCounter++;
            }
            if(Pattern.compile("[A-Z]").matcher(String.valueOf(sentence.charAt(i))).find()){
                bigStringCounter++;
            }
            if(Pattern.compile("[0-9]").matcher(String.valueOf(sentence.charAt(i))).find()){
                numberCounter++;
            }
        }
        System.out.println(bigStringCounter + " " + smallStringCounter + " " + numberCounter);
    }
}
