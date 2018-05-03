package sample;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.WHITE;

public class Taimer extends TimerTask {

    private  Circle indikator;
    public Taimer(Circle indikator){
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
