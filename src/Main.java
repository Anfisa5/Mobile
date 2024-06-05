public class Main {


    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int amount = 100;
        int addAmount = 1100;
        int bonus;

        if (addAmount >= 1000) {
            bonus = (addAmount) / 100 * 1;
        } else {
            bonus = 0;
        }

        int balance = amount + addAmount + bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        System.out.println("Итоговый счёт: " + balance);
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}



