public class Main {
    public static void main(String[] args) {

        int initialSum = 500;
        int sumAdded = 1300;

        if (sumAdded >= 1000) {
            System.out.println("Ваш баланс " + (sumAdded / 100 + initialSum + sumAdded) + " рублей");}
            else {
            System.out.println("Ваш баланс " + (initialSum + sumAdded) + " рублей");
        }
    }
}