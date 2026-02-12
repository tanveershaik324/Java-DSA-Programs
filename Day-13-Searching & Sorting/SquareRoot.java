public class SquareRoot {

    public static int findSqrt(int num) {
        if (num == 0 || num == 1)
            return num;

        int low = 1, high = num, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == num)
                return mid;

            if (mid * mid < num) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println("Square root (floor value): " + findSqrt(number));
    }
}
