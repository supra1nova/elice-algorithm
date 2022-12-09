import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class lv2_약수부자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] intArr = new int[num];
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    intArr[i-1]++;
                }
            }
        }
        System.out.println(IntStream.range(0, num).reduce((l, r) -> intArr[l] > intArr[r] ? l : r).getAsInt() + 1);
    }
}
