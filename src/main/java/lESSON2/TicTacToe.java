package lESSON2;

import lESSON2.entity.Hod;
import lESSON2.entity.Player;

import java.io.*;
import java.util.*;


public class TicTacToe<board> {
    private int counter;
    private static String[] CharPositionArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static String[] position = new String[10];
    private static String player;
    private static String name1;
    private static String name2;
    private static String path;
    private static List<Player> players = new ArrayList<>();
    private static List<Hod> hodList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    private String board[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void main(String[] args) throws Exception {
        String ch;
        System.out.println("Введите имя первого игрока ");
        name1 = scanner.nextLine();
        players.add(0,new Player(1,name1,"X"));
        System.out.println("Введите имя второго игрока ");
        name2 = scanner.nextLine();
        players.add(1,new Player(2,name2,"O"));


        TicTacToe Toe = new TicTacToe();
        do{
            Toe.newBoard();
            Toe.play();
            System.out.println ("Хотите сыграть еще ? ");
            System.out.println("Введите ответ:(yes)");
            Scanner in =new Scanner(System.in);
            ch=in.nextLine();
            System.out.println("Хотите посмотреть запись?(YES)");
            ch=in.nextLine();
            if (ch.equals("YES"))
        ShowGame();

        }while (ch.equals("yes"));

    }

    public void newBoard() throws Exception {


        int i;
        counter = 0;
        player = "X";
        for (i = 0; i < 9; i++) {
            position[i] = CharPositionArray[i];
            board[i] = position[i];
        }


        EnterBoard();
    }

    public static String EnterBoard() throws IOException {


        System.out.println("\n\t" +  position[0] + "   | " + position[1] + "  | " + position[2]);
        System.out.println(" \t ___|____|___ ");
        System.out.println("\n\t" + position[3] + "   | " + position[4] + "  | " + position[5]);
        System.out.println(" \t ___|____|___ ");
        System.out.println("\n\t" + position[6] + "   | " + position[7] + "  | " + position[8]);
        System.out.println(" \t    |    |   ");
        System.out.println("\n");
        return "Обновление стола";
    }

    public void play() throws Exception {
        int spot = 0;
        int hod = 0;
        String blank = " ";
        System.out.println("Игрок " + name1 + " пойдет первым символом X");

        do {
            EnterBoard();

            System.out.println("\n Игрок " + getPlayer() + " Выберите позицию.");

            boolean posTaken = true;
            while (posTaken) {
                Scanner in = new Scanner(System.in);
                spot = in.nextInt() - 1;

                posTaken = checkposition(spot);
                if (!posTaken) {
                    position[spot] = getPlayer();
                    board[spot] = getPlayer();
                    if (board[spot] == "X")
                        hodList.add(hod, new Hod(hod + 1, spot + 1, players.get(0).getId()));
                    else
                        hodList.add(hod, new Hod(hod + 1, spot + 1, players.get(1).getId()));
                    hod++;
                }
            }

            System.out.println("Nice move.");

            EnterBoard();

            nextPlayer();
        } while (checkWinner() == blank);

    }

    public String checkWinner() throws IOException {
        File file = new File("src/main/resources/WinnerList.txt");
        FileWriter fw = new FileWriter(file, true);
        String Winner = " ";

        if (position[0] == "X" && position[1] == "X" && position[2] == "X") Winner = "X";//+
        if (position[3] == "X" && position[4] == "X" && position[5] == "X") Winner = "X";//+
        if (position[6] == "X" && position[7] == "X" && position[8] == "X") Winner = "X";//+
        if (position[0] == "X" && position[3] == "X" && position[6] == "X") Winner = "X";//+
        if (position[1] == "X" && position[4] == "X" && position[7] == "X") Winner = "X";//+
        if (position[2] == "X" && position[5] == "X" && position[8] == "X") Winner = "X";//++
        if (position[0] == "X" && position[4] == "X" && position[8] == "X") Winner = "X";//+
        if (position[2] == "X" && position[4] == "X" && position[6] == "X") Winner = "X";//+
        if (Winner == "X") {

            System.out.println(name1 + " победил.");
            players.add(2, new Player(1, name1, "X"));
            path = Hod.write(players, hodList);

            return Winner;
        }

        if (position[0] == "O" && position[1] == "O" && position[2] == "O") Winner = "O";
        if (position[3] == "O" && position[4] == "O" && position[5] == "O") Winner = "O";
        if (position[6] == "O" && position[7] == "O" && position[8] == "O") Winner = "O";
        if (position[0] == "O" && position[3] == "O" && position[6] == "O") Winner = "O";
        if (position[1] == "O" && position[4] == "O" && position[7] == "O") Winner = "O";
        if (position[2] == "O" && position[5] == "O" && position[8] == "O") Winner = "O";
        if (position[0] == "O" && position[4] == "O" && position[8] == "O") Winner = "O";
        if (position[2] == "O" && position[4] == "O" && position[6] == "O") Winner = "O";
        if (Winner == "O") {

            System.out.println(name2 + " победил.");
            players.add(2, new Player(2, name2, "O"));
            path = Hod.write(players, hodList);
            return Winner;
        }

        for (int i = 0; i < 9; i++) {
            if (position[i] == "X" || position[i] == "O") {
                if (i == 8) {
                    String Draw = "D";
                    System.out.println(" Ничья ");
                    players.add(2, new Player(0, "ДРУЖБА", "XO"));
                    path = Hod.write(players, hodList);
                    return Draw;
                }
                continue;
            } else
                break;

        }

        return Winner;
    }

    public boolean checkposition(int spot) {
        if (position[spot] == "X" || position[spot] == "O") {
            System.out.println("Позиция занята другим игроком, выберите другую");
            return true;
        } else {
            return false;
        }
    }


    public void nextPlayer() {
        if (Objects.equals(player, "X"))
            player = "O";
        else player = "X";

    }

    public  String getPlayer() {
        return player;
    }

    public static void ShowGame() throws IOException {
        List<String> s = XMLL.reader(path);
        String str = String.valueOf(s);
        int[] numbers = Arrays.stream(new String[]{str.replaceAll("[^0-9.]", "")})
                .mapToInt(Integer::parseInt)
                .toArray();

        char[] chars = Arrays.toString(numbers).toCharArray();
        position = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int cnt=0;
        for (int i = 1; i < chars.length-1; i++) {
            for (int j = 0; j < position.length; j++) {
                if (String.valueOf(chars[i]).equals(position[j])) {
                    if (cnt==0 || cnt%2==0){
                        position[Integer.parseInt(String.valueOf(chars[i]))-1] = "X";
                        cnt++;
                    }
                    else{
                        position[Integer.parseInt(String.valueOf(chars[i]))-1] = "O";
                        cnt++;
                    }
                }
            }
            EnterBoard();
        }

    }
}

