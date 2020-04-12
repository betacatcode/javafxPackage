package com.betacat.controller;

import javafx.scene.control.Alert;

public class MainController {

    public void test(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("信息");
        alert.setHeaderText("测试");
        alert.setContentText("测试");
        alert.show();

    }
}
