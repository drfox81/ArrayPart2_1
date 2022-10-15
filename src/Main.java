import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] arrayBuh = creatArrayExpenses(30);
        int[] calculationAvarange = task1(arrayBuh);
        task2(arrayBuh);
        task3(calculationAvarange);
        task4();

    }

    private static void task4() {
        System.out.println("Задача 1-4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task3(int[] calculationAvarange) {
        System.out.println("Задача 1-3");
        double resolt = calculationAvarange[0] / calculationAvarange[1];
        System.out.println("Средняя сумма трат за месяц составила " + resolt + " рублей");
        System.out.println();
    }


    private static void task2(int[] arrayBuh) {
        System.out.println("Задача 1-2");
        int buferMin = arrayBuh[0];
        int buferMax = arrayBuh[0];
        for (int i : arrayBuh) {
            if (buferMin > i) {
                buferMin = i;
            }
            if (buferMax < i) {
                buferMax = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + buferMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + buferMax + " рублей");
        System.out.println();
    }

    public static int[] task1(int[] arrayBuh) {
        System.out.println("Задача 1-1");
        int sumExpensesInMonth = 0;
        for (int i : arrayBuh) {
            sumExpensesInMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumExpensesInMonth + " рублей");
        int sumMethod2 = Arrays.stream(arrayBuh).sum();
        System.out.println("Проверка с помощью стандартного метода " + sumMethod2);
        boolean trueOrFalse = sumExpensesInMonth == sumMethod2;
        System.out.println("Еще одна проверка - " + trueOrFalse);
        System.out.println();
        int numberOfDays = arrayBuh.length;
        int[] sumExpensesInMonthAndNumberOfDays = {sumExpensesInMonth, numberOfDays};
        return sumExpensesInMonthAndNumberOfDays;

    }

    public static int[] creatArrayExpenses(int daysMonth) {
        // daysMonth - определяем кол-во дней в отчете (массиве)
        //System.out.println("Введите математическое ожидание затрат, например 100_000");
        //Scanner s = new Scanner(System.in);
        //int averageExpenses = s.nextInt();

        int averageExpenses = 100_000;
        int[] days = new int[daysMonth];
        for (int i = 0; i < days.length; i++) {
            Random r = new Random();
            days[i] = r.nextInt(100_000) + averageExpenses;
        }
        return days;
    }
}