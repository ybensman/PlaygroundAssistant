package com.sample.playground;

import java.awt.*;

public class PlaygroundMain {

    public static void main(String[] args) {
        if (args.length <2) {
            printUsage();
            return;
        }

        String arg1 = args[0];
        String arg2 = args[1];

        int locationX = 0;
        int locationY = 0;

        try {
            locationX = Integer.parseInt(arg1);
            locationY = Integer.parseInt(arg2);
        }
        catch (NumberFormatException ex){
            printUsage();
            return;
        }

        Point closestToilet = (new Playground()).getClosestToilet(locationX, locationY);

        if (closestToilet == null) {
            System.out.println("No toilets in the playground!");
        }
        else {
            System.out.println("The closest toilet in the playground is located at X=" + closestToilet.x + " and Y=" + closestToilet.y);
        }
    }

    private static void printUsage() {
        System.out.println("Invalid format of incoming parameters");
        System.out.println("Usage: Playground [X] [Y]");
    }
}
