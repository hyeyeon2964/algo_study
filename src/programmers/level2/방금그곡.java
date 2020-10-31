package programmers.level2;

public class 방금그곡 {
        public int getTime(String start, String end)
        {
            int result = 0;
            String[] startTime = start.split(":");
            String[] endTime = end.split(":");

            int time1 = Integer.parseInt(startTime[0]);
            int time2 = Integer.parseInt(endTime[0]);

            result += (time2 - time1) * 60;
            result += Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);
            //재생 시간 구하기

            return result;
        }
        public String playMusic(String music, int time)
        {
            music = music.replaceAll("A#", "a"); //음 변환
            music = music.replaceAll("C#", "c");
            music = music.replaceAll("D#", "d");
            music = music.replaceAll("F#", "f");
            music = music.replaceAll("G#", "g");
            String result = "";

            if(music.length() < time)
            {
                result += music;
                while(time > 0)
                {
                    if(time >= music.length())
                    {
                        result += music;
                        time -= music.length();
                    }

                    else
                    {
                        result += music.substring(0, time);
                        break;
                    }
                }
            }
            else
            {
                result += music.substring(0, time);
            }

            return result;
        }
        public String solution(String m, String[] musicinfos) {
            String answer = "(None)";
            int playTime = 0;
            int maxPlayTime = 0; //만약 똑같은게 있을 때 재생시간이 더 긴걸 리턴하기 위해서 생성
            for (int i = 0; i < musicinfos.length; i++)
            {
                String[] info = musicinfos[i].split(",");
                playTime = getTime(info[0], info[1]);
                String music = playMusic(info[3], playTime);

                m = m.replaceAll("A#", "a");
                m = m.replaceAll("C#", "c");
                m = m.replaceAll("D#", "d");
                m = m.replaceAll("F#", "f");
                m = m.replaceAll("G#", "g");

                System.out.println(music);
                System.out.println(m);
                System.out.println(maxPlayTime);
                System.out.println();

                if(music.contains(m))
                {
                    if(maxPlayTime < playTime)
                    {
                        answer = info[2];
                        maxPlayTime = playTime;
                    }
                }
            }
            return answer;
        }
    public static void main(String[] args) {
    }
}
