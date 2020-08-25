package programmers.level1;

public class 콜라츠추측 {
    public static int solution(int num) {

        for(int i = 0; i<500; i++){
            if(num == 1)
                return i;

                if (num % 2 == 0)
                    num /= 2;
                else if (num % 2 ==1 )
                    num = (num * 3) + 1;

        }

        return -1;


    }

    public static void main(String[] args) {
        solution(626331);
    }
}
