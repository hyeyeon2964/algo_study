package programmers;

public class PrintTriangle {
	public String printTriangle(int num){
        StringBuilder result=new StringBuilder();
        
        for(int i=1; i<num+1; i++ ){
            for(int j=0; j<i; j++){
                result.append("*");
            }
            result.append("\n");
        }
        

		return result.toString();		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}