package P1;

public class General {
    public static int reverse(int number) {
        int reverse = 0;
        while ( number != 0 ) {
            int remainder = number % 10; //if number =456 ---> remainder=6
            reverse = (reverse * 10) + remainder;
            number /= 10;
        }
        return reverse;
    }

    public static int getRandomValue(int value) {
        return (int) (Math.random() * (value + 1));
    }

    public static int getRandomValue(int min, int max) {
        return (int) ((Math.random() * ((max + 1) - min)) + min);

    }

    public static char getRandomCharacter() {
        return (char) ((int) ((Math.random() * ('z' - 'a')) + 'a'));

    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

