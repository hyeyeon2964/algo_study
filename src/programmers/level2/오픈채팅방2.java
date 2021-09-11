//package programmers.level2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class 오픈채팅방2 {
//    public static String[] solution(String[] record) {
//        String[] answer;
//        ArrayList<String> chatInfo = new ArrayList<>();
//        ArrayList<HashMap<String, String>> nickName = new ArrayList<>();
//        String[] id = new String[record.length];
//        ArrayList<String> result = new ArrayList<>();
//
////        for (int i = 0; i < record.length; i++) {
////            String[] temp = record[i].split(" ");
////            chatInfo.add(temp[0]);
////            id[i] = temp[1];
////            HashMap<String, String> map = new HashMap();
////            map.put(temp[1], temp[2]);
////            nickName.add(map);
////        }
//
//        for (int i = 0; i < record.length; i++) {
//            String str = "";
//            if (chatInfo.contains("Change")) {
//                continue;
//            }
//            if (chatInfo.contains("Enter")) {
//                str += nickName.get(i).get(id[i]);
//                str += "님이 들어왔습니다.";
//            } else {
//                str += nickName.get(i).get(id[i]);
//                str += "님이 나갔습니다.";
//            }
//            result.add(str);
//        }
//
//        answer = new String[result.size()];
//
//        for (int i = 0; i< answer.length; i++) {
//            answer[i] = result.get(i);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution(new String[]));
//    }
//
//}
//
