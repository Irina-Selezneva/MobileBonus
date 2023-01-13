public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int payAmount = 1100;
        int bonus = payAmount / 100;

        int finalBalance;

        if (payAmount > 1000) {
            finalBalance = startBalance + payAmount + bonus;
        } else {
            finalBalance = startBalance + payAmount;
            bonus = 0;
        }

        System.out.println("Итоговый счет: " + finalBalance);

        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
