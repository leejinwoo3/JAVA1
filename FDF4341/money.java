package FDF4341;

import java.util.Scanner;
public class money {
    public static void main(String args[]) {
        boolean run = true;
        int save = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.println("선택 > ");
            int num = scanner.nextInt();
            if(num == 1) {
                System.out.println("예금액 > ");
                save += scanner.nextInt();
            } else if (num == 2) {
                System.out.println("출금액 > ");
                save -= scanner.nextInt();
            } else if (num == 3) {
                System.out.println("잔고 > " + save);
            } else if (num == 4) {
                System.out.println("종료");
                break;
            }
        }
    }
}


