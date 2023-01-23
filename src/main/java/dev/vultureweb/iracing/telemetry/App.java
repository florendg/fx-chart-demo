package dev.vultureweb.iracing.telemetry;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.collections.FXCollections;

import java.io.IOException;
import java.net.URL;

public class App extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)  {
      URL fxmFile = App.class.getResource("application.fxml");
      if(fxmFile == null) {
         throw new RuntimeException("Failed to find fxml file");
      }
      try {
         Parent rootPane = FXMLLoader.load(fxmFile);
         Scene scene = new Scene(rootPane, 600, 600);
         primaryStage.setScene(scene);
         primaryStage.show();
      } catch (IOException ioException) {
         throw new RuntimeException(ioException);
      }
   }

}
