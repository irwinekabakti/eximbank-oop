public class Main {
    public static void main(String[] args) {
        try {
            CustomException1.validate(15);
        }catch(InvalidAgeException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }finally {
            System.out.println("process finish!");
        }

    }
}

