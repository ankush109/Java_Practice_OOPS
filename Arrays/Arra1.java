import java.util.*;

public class Arra1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            nums.add(sc.nextInt());
        }
        nums.sort(Comparator.reverseOrder());

        System.out.print(nums);

    }
}
