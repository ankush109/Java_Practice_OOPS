import java.util.*;

public class pca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = new String[1000];
            arr = line.split(" ");
            int total = 0;
            for (String x : arr) {
                total += Integer.parseInt(x);
            }
            System.out.println(total);
        }

    }
}
