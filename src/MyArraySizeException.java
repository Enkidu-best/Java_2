public class MyArraySizeException extends Exception{
    //Обработчик ошибок
    public MyArraySizeException (int i){
        super("Ошибка в строке массива: " + i);
    }
}
