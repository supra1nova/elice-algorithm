import java.util.*;
import java.util.stream.Collectors;

public class day_2_2명단정리 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < num; i++){
            list.add(sc.next().substring(1));
        }
        for(String sentence : list){
            List<String> sentenceList =  Arrays.stream(sentence.split("")).collect(Collectors.toList());
            String start = sentenceList.stream().filter(i -> i.matches("[A-Z]")).findFirst().get();
            System.out.println(sentenceList.subList(sentenceList.indexOf(start), sentenceList.size()).stream().collect(Collectors.joining()));
        }
    }
}
