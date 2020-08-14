package com.javacource.se.lesson7;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import  java.util.*;
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Goddamnshop.com");
        DotCom two = new DotCom();
        two.setName("Eastbay.com");
        DotCom three = new DotCom();
        three.setName("FootLocker.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Goddamnshop.com, Eastbay.com, FootLocker.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLoc = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLoc);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    private void checkUserGuess(String userGuess) {
        numOfGuesses = numOfGuesses + 1;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }
    private void finishGame(){
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses<=18){
            System.out.println("Это заняло у вас всего "+ numOfGuesses + "попыток.");
            System.out.println("Вы успелт выбраться до того, как ваши вложения утонули.");
        }
        else{
            System.out.println("Это заняло у вас довольно много времени. "+ numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокург ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}