package mainpackage;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 999; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);

        User user = new User();
        user.setName("Sara");
        System.out.println(user.getName());

        divide(10, 2);
        divide(10, 0);
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Nollalla ei voi jakaa.");
            return;
        }
        System.out.println(a / b);
    }
}
