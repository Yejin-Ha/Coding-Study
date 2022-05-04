public static Solution{
    
    public static solution() {
        Scanner scan = new Scanner(System.in);
        
        int x =0;
        int fac =1;
        
        System.out.print("정수를 입력하세요: ");
        x=scan.nextInt();
        for(int i =0; i>=1; i--) {
            fac = fac*i;
        }
        System.out.print(x+"!은"+fac);
    }
    public static void main(String arg[]){
        solution();
    }
}
