
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}


Убедитесь, что выводимое в консоль значение соответствует логике расчёта бонуса. Проверьте на разных примерах.