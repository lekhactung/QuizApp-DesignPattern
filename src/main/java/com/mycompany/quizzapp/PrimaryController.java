package com.mycompany.quizzapp;

import com.mycompany.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagment(ActionEvent event) throws IOException {
//        MyAlert.getInstance().showMsg("QuestionManagment : Comming soon...");
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Pratice : Comming soon...");
    }

}
