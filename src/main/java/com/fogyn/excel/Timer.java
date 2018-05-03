package com.fogyn.excel;

import javafx.scene.shape.Circle;

import java.util.TimerTask;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.WHITE;

public class Timer extends TimerTask {

    private  Circle indikator;
    public Timer(Circle indikator){
    this.indikator = indikator;
    }

    @Override
    public void run() {
        if (indikator.getFill().equals(WHITE)) {
            indikator.setFill(GREEN);

        } else {
            indikator.setFill(WHITE);

        }
    }

}
