class PowerRecursion {
    static int power(int base, int exp) {
        if (exp == 0)   // Base case
            return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        int base = 2, exp = 3;
        System.out.println("Power: " + power(base, exp));
    }
}
