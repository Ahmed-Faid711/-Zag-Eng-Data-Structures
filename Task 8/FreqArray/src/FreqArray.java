public class FreqArray {
    public int[] getArray(int[] array, int M) {
        int[] freqArray = new int[M + 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < freqArray.length; j++) {
                if (j == array[i])
                    freqArray[j]++;
            }
        }
        return freqArray;
    }

    public void printArray(int[] freqArray) {
        for (int i = 0; i < freqArray.length - 1; i++) {
            if (freqArray[i] != 0)
                System.out.println(i + ":" + freqArray[i]);
        }
    }
}
