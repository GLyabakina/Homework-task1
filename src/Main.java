public class Main {
    public static void main(String[] args) {
        int amount = 18526; // стоимость билета
        int rub = 20; // количество рублей для одной бонусной мили
        int miles = amount / rub;
        System.out.println(miles);
    }
}
