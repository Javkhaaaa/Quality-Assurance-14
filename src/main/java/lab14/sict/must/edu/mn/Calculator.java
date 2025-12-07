package lab14.sict.must.edu.mn;

/**
 * Тооны машины үндсэн класс.
 */
public class Calculator {
    /**
     * Хоёр тоог нэмнэ.
     *
     * @param a Эхний тоо
     * @param b Хоёр дахь тоо
     * @return Нийлбэр
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Хоёр тоог хасах.
     *
     * @param a Эхний тоо
     * @param b Хоёр дахь тоо
     * @return Ялгавар
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}

