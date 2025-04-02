
//Reverse String using StringBuilder
public class ReverseString2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = "Arjuna";

        sb.append(str);
        sb.reverse();

        System.out.print(sb);
    }
}