package com.rsp.game.player;
import java.util.Scanner;    // Needed for Scanner class

public class player {
  private int card;
  public void setCard(int c){
    this.card = c;
  }
  public int getCard(){
    return this.card;
  }
  public void makeResult(){
    int result = (int)(Math.random()*3);
    String[] resultStrings = new String[]{"승리!", "무승부!", "패배!"};
    
    System.out.println(resultStrings[result]);
  }
  public void chooseCard(){
    System.out.print("어떤 것을 내시겠습니까? (1. 주먹 2. 가위 3. 보자기) => ");

    Scanner console = new Scanner(System.in);
    int choose = console.nextInt();

    setCard(choose);
  }

}
