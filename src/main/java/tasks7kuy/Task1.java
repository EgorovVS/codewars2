package tasks7kuy;

//This time no story, no theory. The examples below show you how to write function accum:
//
//Examples:
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.
//




public class Task1 {
    public static void main(String[] args) {
        System.out.println(accum("abcdE"));
    }

    public static String accum(String s) {
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            str[i] += str[i].repeat(i).toLowerCase();
            StringBuilder temp = new StringBuilder(str[i]);
            temp.setCharAt(0, str[i].toUpperCase().charAt(0));
            str[i] = temp.toString();
        }
        s = "";
        s += str[0];
        for (int i = 1; i < str.length; i++) {

            s += "-" + str[i];
        }

        return s;
    }
}
//public class Accumul {
//    public static String accum(String s) {
//        StringBuilder bldr = new StringBuilder();
//        int i = 0;
//        for(char c : s.toCharArray()) {
//            if(i > 0) bldr.append('-');
//            bldr.append(Character.toUpperCase(c));
//            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
//            i++;
//        }
//        return bldr.toString();
//    }
//}
