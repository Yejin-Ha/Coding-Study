public static void solution(int n) {
    for (int i = n; i > 0; i--) {
        for (int j = i - 1; j > 0; j--) {
            System.out.print(" ");
        }
        for (int k = n; k >= i; k--) {
            System.out.print("*");
        }
        System.out.println();
    }
}