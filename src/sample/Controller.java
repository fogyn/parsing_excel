package sample;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import static java.lang.Thread.sleep;
import static javafx.scene.paint.Color.*;

public class Controller {
    Boolean b = false;
    String s = "";
    @FXML
    Label label1;
    @FXML
    Circle lamp;
    @FXML
    Circle indicator;

    @FXML
    Button button1;
    @FXML
    Button button2;

    @FXML
    TextField text1;
    @FXML
    TextField text2;


    @FXML
    public void onClickMethod() throws InterruptedException {


        onGetText2();
        s = s + " Вы ввели вот такой текст";






        //text2.setText("" + date2);

        indicator.setFill(YELLOW);

        text1.setText(s);
        label1.setText("Все выполнено!");
        lamp.setFill(RED);

    }

    @FXML
    public void onClickMethod2() {

        String s = "";
        //button1.setText("YYYYY");
        text2.setText("");
        text1.setText(s);
        lamp.setFill(BLUE);
        label1.setText("Привет");

    }

    @FXML
    public void onGetText2() {
        s = text2.getText();
        text2.setText("");
        //System.out.println(s);
    }


    public void onText1Method(ActionEvent actionEvent) {
    }
}
