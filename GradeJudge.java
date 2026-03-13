import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请录入你此次成绩：");
            double score = scanner.nextDouble();
            if(score>100){
                System.out.println("你输入的成绩有误，请重新输入!");
                continue;
            }else if(score >= 85){
                System.out.println("你这次成绩的等级为优秀！");
                break;
            }else if(score >= 60){
                System.out.println("你这次成绩的等级为良好！");
                break;
            }else if(score <60 && score >=0){
                System.out.println("你本次成绩的等级为不及格");
                break;
            }else{
                System.out.println("你输入的成绩有误，请重新输入!");
                continue;
            }

        }
    }
}
