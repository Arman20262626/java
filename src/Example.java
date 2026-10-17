package homework;

public class ArrayHomework {

    public static void main(String[] args) {

        int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == n) {
                count++;
            }
        }

        System.out.println("Count of " + n + ": " + count);

        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};

        for (int i = 0; i < numbers2.length / 2; i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedCount = 0;

        for (int i = 0; i < numbers3.length; i++) {
            boolean repeated = false;

            for (int j = 0; j < i; j++) {
                if (numbers3[i] == numbers3[j]) {
                    repeated = true;
                }
            }

            if (!repeated) {
                int count2 = 0;

                for (int j = 0; j < numbers3.length; j++) {
                    if (numbers3[i] == numbers3[j]) {
                        count2++;
                    }
                }

                if (count2 > 1) {
                    repeatedCount++;
                }
            }
        }

        System.out.println("Repeated numbers count: " + repeatedCount);

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' || chars[i] == 'ե' ||
                    chars[i] == 'է' || chars[i] == 'ը' ||
                    chars[i] == 'ի' || chars[i] == 'ո' ||
                    chars[i] == 'օ') {
                vowelsCount++;
            }
        }

        System.out.println("Vowels count: " + vowelsCount);

        int[] numbers5 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers5.length; i++) {
            if (numbers5[i] > max) {
                secondMax = max;
                max = numbers5[i];
            } else if (numbers5[i] > secondMax && numbers5[i] != max) {
                secondMax = numbers5[i];
            }
        }

        System.out.println("Second maximum: " + secondMax);

        int[] numbers6 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};

        for (int i = 0; i < numbers6.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (numbers6[i] == numbers6[j]) {
                    found = true;
                }
            }

            if (!found) {
                System.out.print(numbers6[i] + " ");
            }
        }
        System.out.println();

        int[] numbers7 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int mostFrequent = numbers7[0];
        int mostCount = 0;

        for (int i = 0; i < numbers7.length; i++) {
            int currentCount = 0;

            for (int j = 0; j < numbers7.length; j++) {
                if (numbers7[i] == numbers7[j]) {
                    currentCount++;
                }
            }

            if (currentCount > mostCount) {
                mostCount = currentCount;
                mostFrequent = numbers7[i];
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Count: " + mostCount);
    }
}