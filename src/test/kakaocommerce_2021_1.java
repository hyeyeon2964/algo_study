package test;

public class kakaocommerce_2021_1 {
    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        int complete = 0;
        int[] exchange = new int[gift_cards.length];
        for(int i = 0; i<gift_cards.length; i++) {
            if(gift_cards[i] == wants[i])
                exchange[i] = 0;
            else
                exchange[i] = gift_cards[i];
        }

        int temp = 0;
        for(int i = 0; i<exchange.length; i++) {
            if(exchange[i] != 0){
                for(int j = i + 1; j<exchange.length; j++) {
                    if (wants[i] == exchange[j]) {
                        temp = exchange[i];
                        exchange[i] = exchange[j];
                        exchange[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i<exchange.length; i++)
        {
            if (exchange[i] != 0 && exchange[i] != wants[i])
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 3, 2, 1};
        int[] b = {2, 4, 4, 5, 1};
        System.out.println(solution(a,b));
    }
}
