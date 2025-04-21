import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        String[] tokens = {"(", "x+y", ")", "*5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));
    }
}
