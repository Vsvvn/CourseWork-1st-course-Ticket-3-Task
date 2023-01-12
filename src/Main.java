public class Main {
    public static void main(String[] args) {
        String string = "Слово";
        int divideStringNumber = 2;
        char[] word = string.toCharArray();
        int resultDivided = word.length / divideStringNumber;
        for (int firstHalfString = 0; firstHalfString < resultDivided; firstHalfString++) {
            System.out.print(word[firstHalfString]);
        }

        System.out.println();

        int secondHalfString;

        if (word.length % 2 == 0) {
            for (int i = 0; i < resultDivided; i++) {
                secondHalfString = resultDivided + i;
                System.out.print(word[secondHalfString]);
            }

        } else {
            for (int i = 0; i <= resultDivided; i++) {
                secondHalfString = resultDivided + i;
                System.out.print(word[secondHalfString]);
            }
        }
    }
}