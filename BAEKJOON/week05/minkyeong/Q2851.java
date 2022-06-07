//슈퍼마리오
import java.util.Scanner;
public class Q2851{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int mush[] = new int[10]; // 총 10개 줄
    int mario = 0; // 마리오 점수
    for (int i = 0; i < 10; i++) {
        mush[i] = scan.nextInt(); //버섯 10개 입력받기
    }
    for (int i = 0; i < 10; i++) {
        mario += mush[i]; 
        if (mario >= 100) { //100과 가까운 수 구하기
            if(100-(mario - mush[i]) < mario-100){ //
            System.out.println(mario-mush[i]);
            break;
            }else if(100-(mario - mush[i]) > mario-100) { 
                System.out.println(mario);
                break;
            }else{ //같을 때
                System.out.println(mario);
                break;
            }
        }
    }
    if(mario<100){ 
        System.out.println(mario);
    }
}
}