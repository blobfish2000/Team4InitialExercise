package edu.wpi.teamname;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {


  /**
   * This class file will be used for your application.
   * You will learn more about how this works at a later date. For now, just note that your
   * App will use a Stage object to make a JavaFX scene.
   */
  @Override
  public void init() {
    System.out.println("Starting up");
  }

  @Override
  public void start(Stage primaryStage) {}

  @Override
  public void stop() {
  System.out.println("Shutting Down");
  }
}
