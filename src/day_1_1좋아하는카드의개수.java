import java.util.Arrays;
import java.util.Scanner;

/*
좋아하는 카드의 개수
엘리스는 N개의 카드를 가지고 있습니다.
또한, 엘리스는 좋아하는 숫자가 하나 있습니다.
엘리스가 가지고 있는 N개의 카드 중에서 엘리스가 좋아하는 숫자가 적힌 카드가 몇 개인지 출력하는 프로그램을 작성해주세요.
================================================================================================
 */

/*
입력
첫째 줄에 엘리스가 가지고 있는 카드의 수인 N이 입력됩니다. (1≤N≤1000)
둘째 줄에는 카드에 적힌 숫자 N개가 공백을 기준으로 입력됩니다.
각각의 카드에는 1부터 1000 사이의 정수가 적혀있습니다.
마지막 줄에는 엘리스가 좋아하는 숫자인 M이 입력됩니다. (1≤M≤1000)

출력
첫째 줄에 엘리스가 가지고 있는 N개의 카드 중에서 엘리스가 좋아하는 숫자가 적힌 카드의 수를 출력합니다.
=================================================================================================
*/

public class day_1_1좋아하는카드의개수 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int[] intArray = new int[x];
        for(int i = 0; i < x; i++){
            intArray[i] = sc.nextInt();
        }
        sc.nextLine();
        int expectedNum = sc.nextInt();
        System.out.println(Arrays.stream(intArray).filter(j -> j == expectedNum).count());
    }
}
