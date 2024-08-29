import java.util.Arrays;

public class AscendDescend {
    public static void main(String[] args) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};

        Arrays.sort(ss);
        System.out.printf("%-10s %s%n", "Ascend", "Descend");
        
        for (int i = 0; i < ss.length; i++) {
            System.out.printf("%-10s %s%n", ss[i], ss[ss.length - 1 - i]);
        }
    }
}
