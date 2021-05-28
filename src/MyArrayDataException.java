public class MyArrayDataException extends Exception{
    // Обработчик ошибок 2
    public MyArrayDataException (int i, int j){
        // Для наглядности добавляю 1 (подсчет от 1, а не от 0)
        super("Ошибка в элементе массива: " + (i + 1) + " " + (j + 1));
    }
}
