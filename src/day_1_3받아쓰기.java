import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class day_1_3받아쓰기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        Stream<Integer> integerStream = Arrays.stream(sentence.split(" ")).map(Integer::parseInt);
        List<Integer> integerList = integerStream.collect(Collectors.toList());

//        List<Integer> integerList = Arrays.stream(sentence.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int firstNum = integerList.get(0);
        int secondNum = integerList.get(1);

        String firstStr = sc.next().substring(0, firstNum);
        String secondStr = sc.next().substring(0, secondNum);
        int answer = secondStr.indexOf(firstStr) != -1 ? 1 : 0;

        System.out.println(answer);
    }
}
