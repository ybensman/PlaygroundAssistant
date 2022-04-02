package com.sample.playground;

import com.sample.repository.ToiletsRepository;
import java.awt.*;

public class Playground {
    final ToiletsRepository toiletsRepository = new ToiletsRepository();

    public Point getClosestToilet(int myLocationX, int myLocationY) {
        return toiletsRepository.getClosestObject(myLocationX, myLocationY);
    }
}