package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.Controller;

public class Main extends Application {
    private Controller controller = new Controller();

    @Override
    public void start(Stage stage) throws Exception
    {
        //stage.setTitle("SANYA POSOSI");
        controller.setGridPane();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
