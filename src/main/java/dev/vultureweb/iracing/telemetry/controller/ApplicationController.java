package dev.vultureweb.iracing.telemetry.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {

   @FXML
   StackPane graphPane;


   @Override
   public void initialize(URL location, ResourceBundle resources) {
      graphPane = buildRootPane();
   }

   private static StackPane buildRootPane() {
      var xAxis = new NumberAxis();
      xAxis.setLowerBound(0.0);
      xAxis.setUpperBound(1000.0);
      var yAxis = new NumberAxis();
      var chart= new LineChart<>(xAxis, yAxis);

      ObservableList<LineChart.Data<Number,Number>> data = FXCollections.observableArrayList();
      data.add(new LineChart.Data<>(10,10));
      data.add(new LineChart.Data<>(20,20));

      var series = new LineChart.Series<Number,Number>();
      series.setData(data);

      ObservableList<XYChart.Series<Number,Number>> chartData = FXCollections.observableArrayList();
      chartData.setAll(series);

      chart.getData().addAll(series);

      StackPane rootPane = new StackPane();
      rootPane.getChildren().add(chart);
      return rootPane;
   }
}
