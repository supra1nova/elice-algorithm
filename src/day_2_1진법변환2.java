import java.util.Scanner;

public class day_2_1진법변환2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        String[] splitArr = strArr[0].split("");
        int answer = 0;
        for(int i = 0 ; i < splitArr.length; i++){
            answer += (int) Math.pow(Integer.parseInt(strArr[1]), (splitArr.length - 1) - i) * Integer.parseInt(splitArr[i]);
        }
        System.out.println(answer);
    }
}
