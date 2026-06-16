import java.util.Scanner;

public class HighestFrequencyLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[52];

        for (char ch : str.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a' + 26]++;
            }
        }

        int max = 0;

        for (int x : freq) {
            if (x > max)
                max = x;
        }

        System.out.print("Highest Frequency Letters: ");

        for (int i = 0; i < 26; i++) {
            if (freq[i] == max)
                System.out.print((char)(i + 'A') + " ");
        }

        for (int i = 26; i < 52; i++) {
            if (freq[i] == max)
                System.out.print((char)(i - 26 + 'a') + " ");
        }

        sc.close();
    }
}
