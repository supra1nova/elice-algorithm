import java.util.*;
import java.util.stream.Collectors;

public class week_1_1진법변환 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        List<Integer> intList = Arrays.stream(sc.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int num = intList.get(0);
        int arithmetic = intList.get(1);
        String answer = "";
        while(num > 0){
            int quotient = num/arithmetic;
            int remainder = num % arithmetic;
            answer += remainder;
            num = quotient;
            if(quotient < arithmetic){
                answer += quotient;
                break;
            }
        }

        List<String> collect = Arrays.stream(answer.split("")).collect(Collectors.toList());
        Collections.reverse(collect);
        String res = "";
        for(String e : collect){
            res += e;
        }
        System.out.println(res);
    }
}
