import java.util.Random;
import java.util.Scanner;

public class Util {
    public int getInput() throws IllegalArgumentException{ //사용자의 입력을 받는 함수
        System.out.println("숫자를 입력해 주세요");
        int input;
        Scanner scan = new Scanner(System.in);

        try { //사용자의 입력이 올바르지 않으면 IllegalArgumentException을 던짐
            input = scan.nextInt();
        }catch(Exception e){
            throw new IllegalArgumentException("잘못된 값을 입력하였습니다");
        }
        return input;
    }


    public int generateAnswer(){ // 숫자 3자리를 만들어내는 함수
        Random random =new Random();
        int [] Answer = new int[3]; // 사용자가 맞춰야 하는 정답을 담는 int 배열
        int temp;
        Answer[0]=random.nextInt(8)+1;  // 첫 값이 0이 올 수 없으므로 값은 이렇게 지정

        while(true) { //두번째 값은 1번째 값과 다른 값이 오게끔
            temp = random.nextInt(9);
            if (Answer[0] == temp)
                continue;
            else
                break;
        }
        Answer[1] = temp;

        while(true) { //세번째 값은 1,2번째 값과 다른 값이 오게끔
            temp = random.nextInt(9);
            if (Answer[0] == temp || Answer[1] == temp)
                continue;
            else
                break;
        }
        Answer[2] = temp;

        String str = ""+Answer[0]+Answer[1]+Answer[2]; //
        return Integer.parseInt(str);
    }

}
