/*
1. Создайте метод printThreeWords(), который при вызове должен отпечатать
в столбец три слова: Orange, Banana, Apple.
 */

public class Main {
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}


/*
2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
в противном случае - “Сумма отрицательная”
*/
/*
public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 4;
        int b = -4;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
 */

/*
3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”
 */
/*
public class Main {
    public static void main(String[] args) {
        printColor(0);
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
 */

/*
4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”
 */
/*
public class Main {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 3;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
 */

/*
5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
/*
public class Main {
    public static void main(String[] args) {
        System.out.println(checkSumInRange(6, 3));
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
 */

/*
6. Напишите метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
*/
/*
public class Main {
    public static void main(String[] args) {
        checkNumber(-1);
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
        System.out.println("Число положительное");
    } else {
        System.out.println("Число отрицательное");
    }
    }
}
 */

/*
7. Напишите метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
/*
public class Main {
    public static void main(String[] args) {
        boolean result = isNegative(-1);
        System.out.println(result);
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}
*/

/*
8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
в консоль указанную строку, указанное количество раз
 */

/*
public class Main {
    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printStringMultipleTimes("Hello", 5);
    }
}
 */

/*
9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным,
кроме каждого 100-го, при этом каждый 400-й – високосный
 */
/*
public class Main {
        public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(400));
    }
}
 */

/*
10. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
 */
/*
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        System.out.print("Измененный массив: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
 */

/*
11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100
 */
/*
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
 */

/*
12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2
 */
/*
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.print("Mассив New: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
 */

/*
13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]
 */
/*
public class Main {
    public static void main(String[] args) {
        int size = 3;
        int[][] squareArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            squareArray[i][i] = 1;
            squareArray[i][size - i - 1] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

/*
14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
 */
/*
public class Main {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] resultArray = createArray(10, 5);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
}
 */