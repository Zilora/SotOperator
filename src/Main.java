public class Main {
    public static void main(String[] args) {
        int cash = 2000;
        int cash1 = 100;
        int cash2 = 1000;
        int bonus = cash / 100;
        if (cash < 1000) {
            System.out.println(cash);
            System.out.println("Нет бонуса");
        } else if (cash >= 1000) {
            System.out.println(cash + bonus);
            System.out.println(bonus + "рублей составил бонус ");
        }

    }

}