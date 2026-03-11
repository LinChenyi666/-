import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("我心里想一个1-99的数，你来猜！");
        System.out.println("你现在猜的数是：");
        int secretnumber = random.nextInt(98)+1;
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 99;
        while(true){
            int number = scanner.nextInt();
            if(number<secretnumber){
                min = number;
                System.out.println("猜小啦！请在"+min+"-"+max+"之间继续猜！\n");
                continue;
            }else if (number>secretnumber){
                max = number;
                System.out.println("猜大啦！请在"+min+"-"+max+"之间继续猜！\n");
                continue;
            }else{
                System.out.println("恭喜你猜对啦！");
                break;
            }
        }
    }
}
