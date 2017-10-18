/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codioproblemheartrate;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class CodioProblemHeartRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[][] heartArray = new int[5][3];
        int userRate;
        
        for(int i = 0; i < heartArray.length; i++)
            {
                System.out.printf("Person %d:%n", i+1);
                System.out.print("Enter exercise heart rate: ");
                userRate = userInput.nextInt();
                heartArray[i][0] = userRate;
                System.out.print("Enter resting heart rate: ");
                userRate = userInput.nextInt();
                heartArray[i][1] = userRate;
                System.out.print("Enter sleeping heart rate: ");
                userRate = userInput.nextInt();
                heartArray[i][2] = userRate;
            }
        
        for(int[] person: heartArray)
        {
            for(int heartRate: person)
            {
                System.out.print(heartRate + " ");
            }
            System.out.println("");
        }
        
        double totalHeart;
        for(int i = 0; i < heartArray.length; i++)
        {
            totalHeart = 0;
            System.out.printf("Average heart rate of Person %d: ", i+1);
            for(int j = 0; j < heartArray[0].length; j++)
            {
                totalHeart += heartArray[i][j];
            }
            System.out.print(totalHeart/3);
            System.out.println("");
        }
        
        double totalExercise = 0;
        double totalResting = 0;
        double totalSleeping = 0;
        for(int i = 0; i < heartArray.length; i++)
        {
            int heartRates = i+1;
            switch (heartRates)
                {
                    case 1:
                        totalExercise += heartArray[i][0];
                    case 2:
                        totalResting += heartArray[i][1];
                    case 3:
                        totalSleeping += heartArray[i][2];
                    default:
                        break;
                }
        }
        System.out.print("Average exercising heart rate: ");
        System.out.print(totalExercise);
        System.out.println("");
        System.out.print("Average resting heart rate: ");
        System.out.print(totalResting);
        System.out.println("");
        System.out.print("Average sleeping heart rate: ");
        System.out.print(totalSleeping);
        System.out.println("");
    }
    
}
