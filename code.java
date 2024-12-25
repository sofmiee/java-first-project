public class code {
    public static void main(String[] args) {
        // Задаем четыре целых числа
        int num1 = 10;
        int num2 = 25;
        int num3 = 5;
        int num4 = 30;
        // Предположим, что первое число - это максимум
        int max = num1;
        // Сравниваем max с каждым из остальных чисел и обновляем max, если найдено большее число
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
        max = num4;
        }
    // Выводим максимальное число.
    System.out.println("Максимальное число: " + max);    }
}