import java.util.Scanner;

public class Q10039 {
    // 평균 점수(원섭-세희-상근-숭-강수 순서대로)
    // 점수는 0점 이상, 100점 이하인 5의 배수, 평균점수는 정수
    // 5명의 점수가 주어졌을 때, 평균 점수 구하는 프로그램
    // 40점 이상인 학생들은 그대로 성적 인정, 40점 미만은 보충학습

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0; //점수
        int sum = 0; // 합계

        for(int i = 0; i < 5; i++){
            score = scan.nextInt();
            
            if(score > 40){
                sum += score;
            }
            else {
                sum += 40;
            }
        }
        System.out.println(sum/5);
    }

}

