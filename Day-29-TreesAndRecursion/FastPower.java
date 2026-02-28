class FastPower {
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;

        int half = power(base, exp / 2);

        if (exp % 2 == 0)
            return half * half;
        else
            return base * half * half;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
