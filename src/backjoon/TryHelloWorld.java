package backjoon;

import java.util.Arrays;
/*
 *  ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ���ִ� gcdlcm �Լ��� �ϼ��� ������. 
 *  �迭�� �� �տ� �ִ�����, �� ���� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�
 ���� ��� gcdlcm(3,12) �� �ԷµǸ�, [3, 12]�� ��ȯ���ָ� �˴ϴ�
 */

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int[] arr= {a,b};
        Arrays.sort(arr); // �迭 ����
        int min=arr[0];
        int max=arr[1];
        int gcd = 0;

        
        if(max%min==0) answer[0]=min;//�ִ����� ���ϱ� 
        else {
        	for(int i=1; i<=min; i++) {  
        		if(min%i==0 && max%i==0) gcd=i; 
        	}
        	answer[0]=gcd;
        }

        answer[1]=(a*b)/answer[0]; //�ּҰ������ ����
      
        return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
