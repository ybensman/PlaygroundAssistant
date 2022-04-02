package com.sample.repository;

import java.awt.*;
import java.util.ArrayList;

public abstract class GeoObjectsRepository {
    protected ArrayList<Point> geoObjects;

    GeoObjectsRepository(int inCapacity) {
        geoObjects = new ArrayList<Point>(inCapacity);
    }

    public Point getClosestObject(int myLocationX, int myLocationY) {
        double closestDistance = Double.MAX_VALUE;
        Point closestToilet = null;

        for(int i=0; i<geoObjects.size(); i++) {

            double D = Math.sqrt(Math.pow((myLocationX - geoObjects.get(i).x), 2) + Math.pow((myLocationY - geoObjects.get(i).y), 2));

            if (Double.compare(closestDistance, D) > 0) {
                closestDistance = D;
                closestToilet = geoObjects.get(i);
            }
        }

        return closestToilet;
    }
}
