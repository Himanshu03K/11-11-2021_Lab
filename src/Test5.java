import java.util.InputMismatchException;

public class Test5 {
    public static void main(String[] args) {
        int a = 90;
        try {
            System.out.println(a / 0);                      // ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e   );
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        finally {
            //
        }
        System.out.println("end of program");
    }
}
