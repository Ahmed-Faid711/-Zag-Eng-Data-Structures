package P1;

public class General {
    public static void reverse(int number) {
        int reverse = 0;
        for (; number != 0; ) {
            int remainder = number % 10; //if number =456 ---> remainder=6
            reverse = (reverse * 10) + remainder;
            number /= 10;
        }
        System.out.println(reverse);
    }

    public static int getRandomValue(int value) {
        return (int) (Math.random() * (value + 1));
    }

    public static int getRandomValue(int min, int max) {
        return (int) ((Math.random() * ((max + 1) - min)) + min);

    }

    public static char getRandomCharacter() {
        return (char) ((int) ((Math.random() * (1000000000 - 33)) + 33));

    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

