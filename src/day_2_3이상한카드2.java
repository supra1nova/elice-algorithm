import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class day_2_3이상한카드2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String originalStr = sc.nextLine().substring(0, num);
        String[] splitStr = originalStr.split("");
        List<String> list = new ArrayList<>();
        for(String i : splitStr){
            if(list.size() == 0){
                list.add(i);
            } else if(i.equals(list.get(0))){
                list.remove(0);
            } else{
                list.add(i);
            }
        }
        System.out.println(list.size());
        System.out.println(list.stream().collect(Collectors.joining()));
    }
}
