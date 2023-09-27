/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        int optionNum = mainMenu();
        if (optionNum == 1) {
            dataInput();
        }
    }

    public static int mainMenu() {
        System.out.println("1 - initialise the program with data");

        System.out.println("2 - performance of a user-specified team");

        Scanner sc = new Scanner(System.in);

        String option = sc.nextLine();
        // int optionNum = Integer.parseInt(option);
        return Integer.parseInt(option);
    }

    public static void dataInput() throws FileNotFoundException {

        try ( Scanner readFile = new Scanner(new File("FantasyFootballData1.csv"))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();

                String[] playerData = line.split(",");
                for (String playerData1 : playerData) {
                    System.out.println(playerData1);
                    if(playerData[4].equals("Forward")){
                        Forward player = new Forward(0, playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
                        
                    }
                }
        }

    }
}}
