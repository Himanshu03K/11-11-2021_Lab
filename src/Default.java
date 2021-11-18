public class Default {
    public static void main(String[] args) {

        try
        {
            throw new ArithmeticException("/ by zero");
        }
        catch (RuntimeException obj)
        {
            System.out.println(obj);
        }
    }
}
