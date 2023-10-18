import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/login.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/registration.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/homepage.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/forgotpw.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/employeedetails.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/orderdetails.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/salesreport.fxml"))));
        //stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/supplier.fxml"))));

        stage.show();
        stage.setResizable(false);
    }
}

