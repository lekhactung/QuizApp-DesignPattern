package com.mycompany.quizzapp;

import com.mycompany.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {
    public void handleQuestionManagment(ActionEvent event){
        MyAlert.getInstance().showMsg("QuestionManagment : Comming soon...");
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Pratice : Comming soon...");
    }
   
}
