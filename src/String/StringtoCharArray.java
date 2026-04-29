package String;


public class StringtoCharArray {
    public static void main(String[] args) {
        String s = "hritika";
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
        //✅ 8. trim()
        //👉 Starting/ending spaces remove.
        String a = " hello  ";
        System.out.println(a.trim());
//        ✅ 9. split()
//👉 Break string using spaces.
        String b = " I LOVE AMERICA";
        String[] words = b.split(" ");

        for(String w : words){
            System.out.println(w);
        }

    }
}