public static void solution() {
    System.out.println("연도를 입력하세요");
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println(year +"년은 윤년");
    }else {
        System.out.println(year + "년은 평년");
    }
}