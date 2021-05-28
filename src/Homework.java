public class Homework {
    public static void main(String[] args) {
        try {
            calculateSquare(1,5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculateSquare(int a, int b) throws Exception {
        if (a <= 0 || b <= 0) {
            throw new Exception("Переданные стороны некорректны!");
        } else {
            return a * b; }}



}