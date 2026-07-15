public class Main {
    public static void main(String[] args) {
        // ===== 变量和类型 =====
        String name = "小明";
        int age = 20;
        double height = 175.5;
        boolean isStudent = true;

        System.out.println("===== 个人信息 =====");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("是学生吗：" + isStudent);

        // ===== 条件判断 =====
        if (age >= 18) {
            System.out.println("\n你已成年，可以学 Java 了！");
        } else {
            System.out.println("\n你还未成年，再等等吧");
        }

        // ===== 循环 =====
        System.out.println("\n===== 打印 1 到 5 =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("数字：" + i);
        }

        // ===== 数组 =====
        System.out.println("\n===== 遍历数组 =====");
        String[] courses = {"Java基础", "数据库", "Spring Boot", "项目实战"};
        for (String course : courses) {
            System.out.println("要学：" + course);
        }
    }
}