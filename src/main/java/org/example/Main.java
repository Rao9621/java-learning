import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 1. 输入第一个数字
            System.out.print("请输入第一个数字：");
            double num1 = scanner.nextDouble();

            // 2. 输入运算符
            System.out.print("请输入运算符 (+, -, *, /)：");
            String op = scanner.next();

            // 3. 输入第二个数字
            System.out.print("请输入第二个数字：");
            double num2 = scanner.nextDouble();

            // 4. 计算结果
            double result = 0;
            boolean valid = true;

            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals("/")) {
                if (num2 == 0) {
                    System.out.println("错误：除数不能为 0！");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("错误：不支持的运算符！");
                valid = false;
            }

            if (valid) {
                System.out.println("结果：" + num1 + " " + op + " " + num2 + " = " + result);
            }

            // 5. 询问是否继续
            System.out.print("\n是否继续计算？(y/n)：");
            String choice = scanner.next();
            if (choice.equals("n")) {
                System.out.println("感谢使用，再见！");
                break;
            } else if (!choice.equals("y")) {
                System.out.println("输入无效，已退出。");
                break;
            }
            System.out.println("----------------------");
        }

        scanner.close();
    }
}