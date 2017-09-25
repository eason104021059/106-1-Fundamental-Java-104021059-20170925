//ID:10421059
//NAME: 邱亦辰
//DATE: 2017 09 25
//Purpose:第二周課堂第3題
import java.util.Scanner;
public class test3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str =scn.nextLine();
        char chold=scn.next().charAt(0);
        char chnew=scn.next().charAt(0);
        System.out.println(str.replace(chold,chnew));

    }
}