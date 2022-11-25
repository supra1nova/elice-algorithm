import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class week1_2팰린드롬문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String sentence = sc.nextLine().substring(0, num);
        int answer = 0;
        if(sentence.length() == 1){
            answer = 1;
        } else{
            int halfIndexSize = sentence.length()/2-1;
            List<String> list = Arrays.stream(sentence.split("")).collect(Collectors.toList());
            for(int i = 0; i <= halfIndexSize; i++){
                if(list.get(i).equals(list.get(list.size()-1 - i))){
                    answer = 1;
                } else {
                    answer = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
