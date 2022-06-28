public class Main {
    public static void main(String[] args) {
        // check if there is a teen number
        boolean isTeenNumberHere = TeenNumberChecker.hasTeen(19, 20, 40);
        System.out.println(isTeenNumberHere);
        // check if number is greater then 13 and smaller then 19 inclusively
        boolean isThisNumberATeenNumber = TeenNumberChecker.isTeen(11);
        System.out.println(isThisNumberATeenNumber);
    }
}
