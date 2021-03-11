public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler() {
        if (uniqueChocolateBoiler == null)
            uniqueChocolateBoiler = new ChocolateBoiler();
        return uniqueChocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Заполнение нагревателя молочно-шоколадной смесью
            System.out.println("Нагреватель заполнен! Можно греть молоко...");
        } else System.out.println("Стоп! Нагреватель уже полон!");
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Слить нагретое молоко и шоколад
            empty = true;
            System.out.println("Горячее молоко слито! Можно заполнять нагреватель...");
        } else System.out.println("Стоп! Нагреватель пуст или молоко ещё не нагрето!");
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Доветси содержимое до кипения
            boiled = true;
            System.out.println("Молоко нагрето! Можно сливать молоко...");
        } else System.out.println("Стоп! Нагреватель пуст или молоко уже нагрето!");
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void state() {
        System.out.println("Нагреватель пуст? - " + isEmpty());
        System.out.println("Молоко нагрето? - " + isBoiled());
    }
}
