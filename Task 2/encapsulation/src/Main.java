import P1.General;

public class Main {
    public static void main(String[] args) {

        System.out.println(General.getRandomValue(2));
        System.out.println(General.getRandomValue(5, 10));
        System.out.println(General.getRandomCharacter());

//        Integer []array1={2,5,6,8};
//        Character []array2={'Q','%','V','A'};
        String[] array3 = {"sdfa", "sgfd", "kflgf"};
//
//        General.printArray(array1);
//        General.printArray(array2);
        General.printArray(array3);
        General.reverse(1653);
    }
}

