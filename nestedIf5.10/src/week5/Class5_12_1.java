package week5;

import java.util.Scanner;

public class Class5_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your health status (good/bad):");
        String healthStatus = sc.next();

        if (healthStatus.equals("good")){
            System.out.println("Enter your fitness level (high/medium/low):");
            String fitLevel = sc.next();
            if (fitLevel.equals("high")){
                System.out.println("We recommend you to prepare for a full marathon");
            } else if (fitLevel.equals("medium")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if (fitLevel.equals("low")) {
                System.out.println("We recommend you to prepare for a 5k run");
            }else {
                System.out.println("Wrong entry for fitness level");
            }
        }else if (healthStatus.equals("bad")){
            System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
        } else {
            System.out.println("Wrong entry for health status");
        }
    }
}
