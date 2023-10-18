package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {

    public PieChart pieChartHome;
    private Parent parent;
    private Stage stage;
    private Scene scene;

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

    public void btnLogoutAction(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void btnEmployerDetails(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/employeedetails.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void btnSalesReport(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/salesreport.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void btnSupplierDetails(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/supplier.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void btnOrderDetails(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/orderdetails.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}


