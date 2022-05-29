import java.util.Scanner;

// 영문 문자를 입력받아 모음의 개수를 세는 프로그램을 작성
// 각 줄마다 영어 대소문자 , . ! ? 공백으로 이루어진 문장이 주어짐.
// 각 줄마다 모음개수는?
// 필요한 변수 count(모음개수), str(입력받을 String) , ch(문자 char 배열 )

public class Q1264 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(true){
        String str = scan.nextLine();

        if(str.equals("#")){
            break;
        }

        int count = 0;
        char[] index = {'a','e','i','o','u','A','E','I','O','U'};

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i); // i번째를 char타입으로 변환
            for(int j = 0; j < index.length; j++){
                if( ch == index[j]){
                    count++; //입력받은거랑 모음이랑 같으면 개수 증가
                }
            }
        }
            System.out.println(count);
     }
    }
}