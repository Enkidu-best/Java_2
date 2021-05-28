import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        // Создаем двумерный массив.
//            String[][] arr = new String[4][4];
        // Вариант 1 - все ок
        String [][] arrString = {{"5","7","3","17"}, {"7","0","1","12"}, {"8","1","2","3"}, {"8","1","2","3"}};
        // Вариант 2 - буквы и символы
//        String [][] arrString = {{"5",".","3","17"}, {"ф","0","1","12"}, {"8","1","2","3"}, {"8","1","2","3"}};
        // Вариант 3 - большая размерность массива
//        String [][] arrString = {{"5","7","3","17",""}, {"7","0","1","12"}, {"8","1","2","3"}, {"8","1","2","3"}};
        System.out.println(Arrays.deepToString(arrString));

        try {
            // Вызываем метод, который принимает в качестве параметра двумерный массив.
            print2DArray(arrString);
        } catch (Exception MyArraySizeException) {
            MyArraySizeException.printStackTrace();
        }
    }

        // Передаем значения массива в метод
        public static int print2DArray(String[][] arrString) throws Exception {
            // Проверка на размерность массива по x
            int test = 1;
            if (arrString[0].length != 4) {
                test = 0;
                System.out.println("Размерность массива не равна 4 X 4");
                throw new MyArraySizeException(arrString.length);
            } else {
                // Проверка на размерность массива по y
                for (String[] i : arrString){
                    if (i.length != 4){
                        test = 0;
                        System.out.println("Размерность массива не равна 4 X 4");
                        throw new MyArraySizeException(arrString.length);
                    }
                }
            }
            if (test == 1){
            System.out.println("Массив имеет размерность 4 X 4");}

            // Преобразование массива из String в int
            // Создаем двойной цикл с перебором
            int sumArr = 0;
            for (int i = 0; i < arrString.length; i++) {
                for (int j = 0; j < arrString[0].length; j++) {
                    // Сам процесс преобразования каждого элемента массива из String в int
                    try {
                        sumArr = sumArr + Integer.parseInt(arrString[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
            // Печатаем сумму
            System.out.println("Сумма элементов массива равна: " + sumArr);
            return sumArr;
        }
}
