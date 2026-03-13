public class ForloopPractice {
    public static void main(String[] args) {
        System.out.println("=====打印1-10=====");
        for (int i = 1;i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=====打印10-1=====");
        for (int i =10; i >=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("=====打印1-100的偶数=====");

        for (int i =1; i <= 100; i++){

            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("=====计算1-100的和=====");
        int sum = 0;
        for (int i =1; i<=100;i++){
            sum+=i;

        }
        System.out.println("1-100的和为："+sum);

    }
}
