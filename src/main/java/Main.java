import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            String input = scanner.next();
            if (input.equals("сумма")) break;
            else sum += Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}
