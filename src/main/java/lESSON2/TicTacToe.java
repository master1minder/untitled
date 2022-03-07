package lESSON2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TicTacToe
{
    private int counter;
    private   char position[]=new char[10];
    private   char player;


    public static void main(String args[]) throws IOException {

        String ch;
        TicTacToe Toe=new TicTacToe();
        do{
            Toe.newBoard();
            Toe.play();
            System.out.println ("Хотите сыграть еще ? ");
            Scanner in =new Scanner(System.in);
            ch=in.nextLine();
            System.out.println("Введите ответ:(yes)"+ch);
        }while (ch.equals("yes"));


    }
    public  void newBoard()
    {

        char CharPositionArray[] = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i;
        counter = 0;
        player = 'X';
        for (i=1; i<10; i++) position[i]=CharPositionArray[i];
        EnterBoard();


    }
    public  String EnterBoard()
    {
        System.out.println(  "\n\t" + position [1] + "   | " +position [2]+ "  | " +position [3]);
        System.out.println(  " \t ___|____|___ " );
        System.out.println(  "\n\t" +position [4]+ "   | " +position [5]+ "  | " +position [6]);
        System.out.println(  " \t ___|____|___ " );
        System.out.println(  "\n\t" +position [7]+ "   | " +position [8]+ "  | " +position [9]);
        System.out.println(  " \t    |    |   " );
        System.out.println(  "\n" );
        return "Обновление стола";
    }

    public  void play() throws IOException {
        int spot;
        char blank = ' ';

        System.out.println(  "Игрок " + getPlayer() +" пойдет первым символом 'X'" );

        do {
            EnterBoard();

            System.out.println(  "\n Игрок " + getPlayer() +" Выберите позицию." );

            boolean posTaken = true;
            while (posTaken) {
                Scanner in =new Scanner (System.in);
                spot=in.nextInt();
                posTaken = checkposition(spot);
                if(posTaken==false)
                    position[spot]=getPlayer();
            }

            System.out.println(  "Nice move." );

            EnterBoard();

            nextPlayer();
        }while ( checkWinner() == blank );

    }

    public  char checkWinner() throws IOException {
        File file = new File("src/main/resources/WinnerList.txt");
        FileWriter fw = new FileWriter(file);
        char Winner = ' ';

        if (position[1] == 'X' && position[2] == 'X' && position[3] == 'X') Winner = 'X';
        if (position[4] == 'X' && position[5] == 'X' && position[6] == 'X') Winner = 'X';
        if (position[7] == 'X' && position[8] == 'X' && position[9] == 'X') Winner = 'X';
        if (position[1] == 'X' && position[4] == 'X' && position[7] == 'X') Winner = 'X';
        if (position[2] == 'X' && position[5] == 'X' && position[8] == 'X') Winner = 'X';
        if (position[3] == 'X' && position[6] == 'X' && position[9] == 'X') Winner = 'X';
        if (position[1] == 'X' && position[5] == 'X' && position[9] == 'X') Winner = 'X';
        if (position[3] == 'X' && position[5] == 'X' && position[7] == 'X') Winner = 'X';
        if (Winner == 'X' )
        {System.out.println("PlayerX победил." );
            fw.write("PlayerX победил.");
            fw.flush();
            return Winner;
        }

        if (position[1] == 'O' && position[2] == 'O' && position[3] == 'O') Winner = 'O';
        if (position[4] == 'O' && position[5] == 'O' && position[6] == 'O') Winner = 'O';
        if (position[7] == 'O' && position[8] == 'O' && position[9] == 'O') Winner = 'O';
        if (position[1] == 'O' && position[4] == 'O' && position[7] == 'O') Winner = 'O';
        if (position[2] == 'O' && position[5] == 'O' && position[8] == 'O') Winner = 'O';
        if (position[3] == 'O' && position[6] == 'O' && position[9] == 'O') Winner = 'O';
        if (position[1] == 'O' && position[5] == 'O' && position[9] == 'O') Winner = 'O';
        if (position[3] == 'O' && position[5] == 'O' && position[7] == 'O') Winner = 'O';
        if (Winner == 'O' )
        {
            System.out.println( "PlayerO победил." );
            fw.write("PlayerO победил.");
            fw.flush();
            return Winner; }

        for(int i=1;i<10;i++)
        {
            if(position[i]=='X' || position[i]=='O')
            {
                if(i==9)
                {
                    char Draw='D';
                    System.out.println(" Ничья ");
                    fw.write(" Ничья ");
                    fw.flush();
                    return Draw;
                }
                continue;
            }
            else
                break;

        }

        return Winner;
    }

    public  boolean checkposition(int spot)
    {
        if (position[spot] == 'X' || position[spot] == 'O')
        {
            System.out.println("Позиция занята другим игроком, выберите другую");
            return true;
        }
        else {
            return false;
        }
    }



    public  void nextPlayer()
    {
        if (player == 'X')
            player = 'O';
        else player = 'X';

    }

    public  char getPlayer()
    {
        return player;
    }

}
