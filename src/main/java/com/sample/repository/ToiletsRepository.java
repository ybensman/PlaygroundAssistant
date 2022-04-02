package com.sample.repository;

import java.awt.*;

public class ToiletsRepository extends GeoObjectsRepository {

    public ToiletsRepository() {
        super(10);

        geoObjects.add(new Point(1, 2));
        geoObjects.add(new Point(7, 8));
        geoObjects.add(new Point(5, 4));

    }

}
