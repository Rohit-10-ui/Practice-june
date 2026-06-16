public class StringCompress {

    public static String compress(String str) {

        String result = "";
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {

                result += str.charAt(i - 1);

                if (count > 1) {
                    result += count;
                }

                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "AAACCCBBD";

        System.out.println(compress(s));
    }
}
