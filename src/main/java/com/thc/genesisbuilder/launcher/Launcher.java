package com.thc.genesisbuilder.launcher;

import com.thc.genesisbuilder.algos.SHA256;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        GenesisBuilder gb = new GenesisBuilder();
        Scanner alInput = new Scanner(System.in);
        Scanner difInput = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter algorithm:\n");
        String selectedAlgo = alInput.nextLine();
        System.out.println("Enter difficulty:\n");
        int selectedDifficulty = difInput.nextInt();
        System.out.println("Enter pszTimeStamp:\n");
        String pszTimeStamp = alInput.nextLine();
        gb.buildGenesisBlock(0, System.currentTimeMillis(), pszTimeStamp, "", "", SHA256.generateSHA256Hash(0L + pszTimeStamp + ""), 0L, "none", selectedAlgo, selectedDifficulty, 50);
    }
}
