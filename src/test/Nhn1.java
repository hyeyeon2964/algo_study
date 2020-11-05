package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Nhn1 {
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.


        char setPlayer = 'A';
        char[] players = new char[numOfAllPlayers-1];
        HashMap<Character, Integer> game = new HashMap<>();
        game.put(setPlayer++, 1);
        for(int i = 0; i< numOfAllPlayers-1; i++)
        {
            game.put(setPlayer, 0);
            players[i] = setPlayer;
        }
        ArrayList<Character> fastPlayers = new ArrayList<>();
        for(int i = 0; i<numOfQuickPlayers; i++)
        {
            fastPlayers.add(namesOfQuickPlayers[i]);

        }

        int tag = 'A';
        char temp;
        int move = 0;
        for(int i = 0; i<numOfGames; i++){
            move = numOfMovesPerGame[i];

            if(move<0)
            {
                move *= -1;
                if(move > players.length-1)
                {
                    while (move > players.length )
                    {
                        move
                    }
                }

            }
        }

        for(int i =0; i<players.length-1; i++){
            System.out.println(players[i] + " "+game.get(players[i]));
        }
        System.out.println(tag + " "+game.get(tag));
    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for(int i = 0; i < inputData.numOfGames ; i++){
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}