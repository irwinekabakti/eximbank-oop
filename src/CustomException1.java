public class CustomException1 {
    static void validate (int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("age is not valid to vote!");
        }else {
            System.out.println("welcome to vote!");
        }
    }
};
