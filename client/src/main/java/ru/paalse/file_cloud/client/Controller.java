package ru.paalse.file_cloud.client;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class Controller {
    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
