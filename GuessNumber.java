import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
        public static void main(String[] args){
            System.out.println("现在我心里想一个1到100的数字");
            System.out.println("如果你猜出来是多少，就奖励你喝一杯蜜雪冰城！");

            Random random = new Random();
            int secretNumber = random.nextInt(100)+1;
            System.out.println("我猜这个数是：");
            Scanner scanner = new Scanner(System.in);

            while(true){
                int number = scanner.nextInt();
                if(number==secretNumber){
                    System.out.println("猜对啦！蜜雪冰城走起！");
                    break;
                }else if(number > secretNumber){
                    System.out.println("猜大了，请继续！");
                    continue;
                }else{
                    System.out.println("猜小了，继续猜！");
                    continue;
                }
            }


        }
}
