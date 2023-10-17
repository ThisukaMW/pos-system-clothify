package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {

    public PieChart pieChartHome;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data> pieObservableList= FXCollections.observableArrayList(
                new PieChart.Data("Gents",10),
                new PieChart.Data("Ladies",40),
                new PieChart.Data("Kids",20),
                new PieChart.Data("Other",30)
        );
        pieChartHome.setData(pieObservableList);
    }
}
