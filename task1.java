import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String num = scanner.nextLine();
        int number = Integer.parseInt(num);
        System.out.println(sum(number));
        System.out.println(factorial((number)));

        
    }
    static int sum (int n){
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    static int factorial (int n){
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
