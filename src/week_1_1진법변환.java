import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class week_1_1진법변환 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        Integer origNum = Integer.parseInt(strArr[0]);
        Integer divNum = Integer.parseInt(strArr[1]);
        List<String> list = new ArrayList<>();
        if(origNum != 0 || divNum != 0){
            while(origNum >= divNum){
                list.add(0, (origNum % divNum) + "");
                origNum /= divNum;
            }
            list.add(0, origNum + "");
        }
        if( origNum == 0 || divNum == 0){
            System.out.println(0);
        } else {
            System.out.println(list.stream().reduce((l, r) -> l + r).get());
        }
    }
}
