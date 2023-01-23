module dev.vultureweb.iracing.telemetry {
   requires javafx.controls;
   requires javafx.fxml;
   opens dev.vultureweb.iracing.telemetry to javafx.graphics;
   opens dev.vultureweb.iracing.telemetry.controller to javafx.fxml;
}