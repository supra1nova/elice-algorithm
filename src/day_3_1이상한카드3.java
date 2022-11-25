import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class day_3_1이상한카드3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String sentence = sc.nextLine();
        List<String> list = new ArrayList<>();

        if(sentence.length() != 0){
            sentence = sentence.substring(0, num);
            for(String word : sentence.split("") ){
                if(list.size() == 0){
                    list.add(word);
                } else if ( word.equals(list.get(0))  ){
                    list.remove(list.get(0));
                } else if( word.equals(list.get(list.size()-1)) ){
                    list.remove(list.get(list.size()-1));
                } else{
                    list.add(word);
                }
            }
        }
        System.out.println(list.size());
        System.out.println(list.stream().collect(Collectors.joining()));
    }
}
