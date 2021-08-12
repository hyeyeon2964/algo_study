package test;

import java.util.HashMap;

public class dev_2021_1 {
    public static String find_referral(String[] enroll, String[]referral, String seller) {
        int index = 0;
        String result;
        for(int i = 0; i<enroll.length; i++){
            if (enroll[i].equals(seller)){
                index = i;
            }
        }
        result = referral[index];
        return result;
    }
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < enroll.length; i++) {
            map.put(enroll[i],0);
        }

        int price = 0;
        String person;
        for(int i = 0; i<amount.length; i++) {
            price = map.get(seller[i]);
            price += (amount[i] * 100) * 0.9;
            map.put(seller[i], price);
            price = (int)((amount[i] * 100) * 0.1);
            person = seller[i];
            while(true) {
                person = find_referral(enroll, referral, person);
                if (find_referral(enroll, referral, person).equals("-")) {
                    price = price - (int)(price * 0.1);
                    map.put(person, map.get(person) + price);
                    break;
                }
                else {
                    int num = (int) (price * 0.9);
                    map.put(person, map.get(person) +num);
                    price = (int)(price * 0.1);
                }
            }

        }
        for(int i = 0; i<enroll.length; i++) {
            answer[i] = map.get(enroll[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        System.out.println(solution(enroll, referral, seller, amount));
    }
}
