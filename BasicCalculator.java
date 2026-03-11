public class BasicCalculator {
    public static void main(String[] args) {
        int a = 17;
        int b = 4;
        int sum = a + b;
        int difference = a - b;
        int product =  a * b;
        int quotient = a / b;
        int remainder = a % b;


        System.out.println("加法：a+b="+sum);
        System.out.println("减法：a-b="+difference);
        System.out.println("乘法：a*b="+product);
        System.out.println("除法：a/b="+quotient);
        System.out.println("取余：a%b="+remainder);

        /*自增自减测试*/
        System.out.println("a初始值为："+a);
        a++;
        System.out.println("a++后值为："+a);

        ++a;
        System.out.println("++a后值为：" + a);
        --a;
        System.out.println("--a后值为："+a);

    }
}
