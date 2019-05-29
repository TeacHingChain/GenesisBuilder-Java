package com.thc.genesisbuilder.launcher;

import com.thc.genesisbuilder.algos.SHA256;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

class GenesisBuilder {
    private static long hashRate;

    void buildGenesisBlock(long index, long currentTimeMillis, String pszTimeStamp, String fromAddress, String toAddress, String txHash, long Nonce, String previousBlockHash, String algo, int difficulty, float amount) throws InterruptedException {
        if (algo.contentEquals("sha256")) { // will be able to select algorithm for genesis eventually
            boolean iterator = true;
            long startTime = System.nanoTime();
            TimeUnit.SECONDS.sleep(1);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\n");
                    System.out.println("Current hash rate: " + hashRate + " " + "hash/s");
                }
            }, 0, 3000);

            while (iterator) {
                String blockHeader = (index + currentTimeMillis + pszTimeStamp + fromAddress + toAddress + txHash + Nonce + previousBlockHash + algo + difficulty + amount);
                String hash = SHA256.generateSHA256Hash(blockHeader);
                long deltaS;
                long deltaN;
                long endTime;
                if (difficulty == 1) {

                    if (!hash.startsWith("0")) {
                        Nonce++;
                        endTime = System.nanoTime();
                        deltaN = endTime - startTime;
                        deltaS = (deltaN / 1000000000);
                        hashRate = (Nonce / deltaS);
                    } else {
                        System.out.println("\n");
                        System.out.println("Hash found! \n");
                        System.out.println("\n");
                        System.out.println("--------------------------BLOCK DETAILS--------------------------");
                        System.out.println("\n");
                        System.out.println("Mined block hash: \n" + hash);
                        System.out.println("\n");
                        System.out.println("Index: \n" + index);
                        System.out.println("\n");
                        System.out.println("Unix time stamp: \n" + currentTimeMillis);
                        System.out.println("\n");
                        System.out.println("Data: \n" + pszTimeStamp);
                        System.out.println("\n");
                        System.out.println("Previous " + previousBlockHash);
                        System.out.println("\n");
                        System.out.println("Nonce: \n" + Nonce);
                        System.out.println("\n");
                        System.out.println("Difficulty: \n" + difficulty);
                        System.out.println("\n");
                        boolean isGenesisValid = validateGenesisHash(index, currentTimeMillis, pszTimeStamp, fromAddress, toAddress, txHash, Nonce, previousBlockHash, algo, difficulty, amount, hash);
                        if (isGenesisValid) {
                            timer.cancel();
                            iterator = false;
                        } else {
                            System.out.println("ERROR! The hash is not passing validation!");
                            timer.cancel();
                            iterator = false;
                        }
                    }

                } else if (difficulty == 2) {

                    if (!hash.startsWith("00")) {
                        Nonce++;
                        endTime = System.nanoTime();
                        deltaN = endTime - startTime;
                        deltaS = (deltaN / 1000000000);
                        hashRate = (Nonce / deltaS);
                    } else {
                        System.out.println("\n");
                        System.out.println("Hash found! \n");
                        System.out.println("\n");
                        System.out.println("--------------------------BLOCK DETAILS--------------------------");
                        System.out.println("\n");
                        System.out.println("Mined block hash: \n" + hash);
                        System.out.println("\n");
                        System.out.println("Index: \n" + index);
                        System.out.println("\n");
                        System.out.println("Unix time stamp: \n" + currentTimeMillis);
                        System.out.println("\n");
                        System.out.println("Data: \n" + pszTimeStamp);
                        System.out.println("\n");
                        System.out.println("Previous " + previousBlockHash);
                        System.out.println("\n");
                        System.out.println("Nonce: \n" + Nonce);
                        System.out.println("\n");
                        System.out.println("Difficulty: \n" + difficulty);
                        System.out.println("\n");
                        boolean isGenesisValid = validateGenesisHash(index, currentTimeMillis, pszTimeStamp, fromAddress, toAddress, txHash, Nonce, previousBlockHash, algo, difficulty, amount, hash);
                        if (isGenesisValid) {
                            timer.cancel();
                            iterator = false;
                        } else {
                            System.out.println("ERROR! The hash is not passing validation!");
                            timer.cancel();
                            iterator = false;
                        }
                    }

                } else if (difficulty == 3) {

                    if (!hash.startsWith("000")) {
                        Nonce++;
                        endTime = System.nanoTime();
                        deltaN = endTime - startTime;
                        deltaS = (deltaN / 1000000000);
                        hashRate = (Nonce / deltaS);
                    } else {
                        System.out.println("\n");
                        System.out.println("Hash found! \n");
                        System.out.println("\n");
                        System.out.println("--------------------------BLOCK DETAILS--------------------------");
                        System.out.println("\n");
                        System.out.println("Mined block hash: \n" + hash);
                        System.out.println("\n");
                        System.out.println("Index: \n" + index);
                        System.out.println("\n");
                        System.out.println("Unix time stamp: \n" + currentTimeMillis);
                        System.out.println("\n");
                        System.out.println("Data: \n" + pszTimeStamp);
                        System.out.println("\n");
                        System.out.println("Previous " + previousBlockHash);
                        System.out.println("\n");
                        System.out.println("Nonce: \n" + Nonce);
                        System.out.println("\n");
                        System.out.println("Difficulty: \n" + difficulty);
                        System.out.println("\n");
                        boolean isGenesisValid = validateGenesisHash(index, currentTimeMillis, pszTimeStamp, fromAddress, toAddress, txHash, Nonce, previousBlockHash, algo, difficulty, amount, hash);
                        if (isGenesisValid) {
                            timer.cancel();
                            iterator = false;
                        } else {
                            System.out.println("ERROR! The hash is not passing validation!");
                            timer.cancel();
                            iterator = false;
                        }
                    }

                } else if (difficulty == 4) {

                    if (!hash.startsWith("0000")) {
                        Nonce++;
                        endTime = System.nanoTime();
                        deltaN = endTime - startTime;
                        deltaS = (deltaN / 1000000000);
                        hashRate = (Nonce / deltaS);
                    } else {
                        System.out.println("\n");
                        System.out.println("Hash found! \n");
                        System.out.println("\n");
                        System.out.println("--------------------------BLOCK DETAILS--------------------------");
                        System.out.println("\n");
                        System.out.println("Mined block hash: \n" + hash);
                        System.out.println("\n");
                        System.out.println("Index: \n" + index);
                        System.out.println("\n");
                        System.out.println("Unix time stamp: \n" + currentTimeMillis);
                        System.out.println("\n");
                        System.out.println("Data: \n" + pszTimeStamp);
                        System.out.println("\n");
                        System.out.println("Previous " + previousBlockHash);
                        System.out.println("\n");
                        System.out.println("Nonce: \n" + Nonce);
                        System.out.println("\n");
                        System.out.println("Difficulty: \n" + difficulty);
                        System.out.println("\n");
                        boolean isGenesisValid = validateGenesisHash(index, currentTimeMillis, pszTimeStamp, fromAddress, toAddress, txHash, Nonce, previousBlockHash, algo, difficulty, amount, hash);
                        if (isGenesisValid) {
                            timer.cancel();
                            iterator = false;
                        } else {
                            System.out.println("ERROR! The hash is not passing validation!");
                            timer.cancel();
                            iterator = false;
                        }
                    }
                } else if (difficulty == 5) {

                    if (!hash.startsWith("00000")) {
                        Nonce++;
                        endTime = System.nanoTime();
                        deltaN = endTime - startTime;
                        deltaS = (deltaN / 1000000000);
                        hashRate = (Nonce / deltaS);
                    } else {
                        System.out.println("\n");
                        System.out.println("Hash found! \n");
                        System.out.println("\n");
                        System.out.println("--------------------------BLOCK DETAILS--------------------------");
                        System.out.println("\n");
                        System.out.println("Mined block hash: \n" + hash);
                        System.out.println("\n");
                        System.out.println("Index: \n" + index);
                        System.out.println("\n");
                        System.out.println("Unix time stamp: \n" + currentTimeMillis);
                        System.out.println("\n");
                        System.out.println("Data: \n" + pszTimeStamp);
                        System.out.println("\n");
                        System.out.println("Tx hash: " + txHash);
                        System.out.println("\n");
                        System.out.println("Merkle hash: " + SHA256.generateSHA256Hash(txHash));
                        System.out.println("\n");
                        System.out.println("Previous " + previousBlockHash);
                        System.out.println("\n");
                        System.out.println("Nonce: \n" + Nonce);
                        System.out.println("\n");
                        System.out.println("Difficulty: \n" + difficulty);
                        System.out.println("\n");
                        boolean isGenesisValid = validateGenesisHash(index, currentTimeMillis, pszTimeStamp, fromAddress, toAddress, txHash, Nonce, previousBlockHash, algo, difficulty, amount, hash);
                        if (isGenesisValid) {
                            timer.cancel();
                            iterator = false;
                        } else {
                            System.out.println("ERROR! The hash is not passing validation!");
                            timer.cancel();
                            iterator = false;
                        }
                    }
                }
            }
        }
    }

    private boolean validateGenesisHash(long index, long currentTimeMillis, String pszTimeStamp, String recvKey, String minerKey, String txHash, long Nonce, String previousBlockHash, String algo, int difficulty, float amount, String genesisHash) {
        String checkHash = SHA256.generateSHA256Hash(index + currentTimeMillis + pszTimeStamp + recvKey + minerKey + txHash + Nonce + previousBlockHash + algo + difficulty + amount);
        if (!checkHash.contentEquals(genesisHash)) {
            System.out.println("\n");
            System.out.println("Hash is invalid!\n");
            System.out.println("\n");
            return false;

        } else {
            System.out.println("\n");
            System.out.println("Hash is valid!\n");
            System.out.println("\n");
            return true;
        }
    }
}

