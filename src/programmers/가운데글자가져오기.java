package programmers;
/*
 * getMiddle메소드는 하나의 단어를 입력 받습니다. 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */


public class 가운데글자가져오기 {
    String getMiddle(String word){
        int length=word.length();
        String result;
        if(length%2==0){
            result=word.substring(length/2-1, length/2+1 ); //substring(이상, 미만)
        }
        
        else{
            result=word.substring(length/2, length/2+1 );
        }
        
    	return result;    
    }
    // 실행을 위한 메인 함수
    public static void  main(String[] args){
    	가운데글자가져오기 se = new 가운데글자가져오기();
        System.out.println(se.getMiddle("power"));
    }
}