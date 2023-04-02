import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double currencyRate;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        currencyRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        amount = scanner.nextDouble();

        double result = currencyRate * amount;

        System.out.printf("Итого: %.2f", result);
    }
}
