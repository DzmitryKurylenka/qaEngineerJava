public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
                {"5", "5", "5", "5"},
                {"6", "6", "6", "6"}
        };
        String[][] incorrectDataArray = {
                {"1", "3", "3", "3"},
                {"4", "4", "4", "4"},
                {"5", "5", "5", "5"},
                {"6", "6", "6", "F"}
        };
        String[][] incorrectSizeArray = {
                {"3", "3", "3"},
                {"4", "4", "4"},
                {"5", "5", "5"}
        };
        try {
            int sum = checkAndSumArray(correctArray);
            System.out.println("Сумма всех элементов верного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = checkAndSumArray(incorrectDataArray);
            System.out.println("Сумма всех элементов массива с неверными данными: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = checkAndSumArray(incorrectSizeArray);
            System.out.println("Сумма всех элементов массива неправильного размера: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int checkAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int expectedSize = 4;
        if (array.length != expectedSize) {
            throw new MyArraySizeException("Количество строк неверно. Ожидаемый результат: " + expectedSize);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != expectedSize) {
                throw new MyArraySizeException("В строке " + (i + 1) + " неверное количество столбцов. Ожидаемый результат: " + expectedSize);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j + "]. Значение: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}