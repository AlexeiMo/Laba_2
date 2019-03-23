package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {
    private Stage stage = new Stage();

    private Button btn1 = new Button("Internet Expander");
    private Button btn2 = new Button("Exit");
    private Label lbl1 = new Label("Download browser: ");
    private Label lbl2 = new Label("Exit program: ");

    private Button btn3 = new Button("Install");
    private Button btn4 = new Button("Cancel");
    private Label lbl3 = new Label("Install Firecat browser: ");
    private Label lbl4 = new Label("Cancel installation: ");

    private Button btn5 = new Button("Download");
    private Button btn6 = new Button("Delete");
    private Label lbl5 = new Label("Download film: ");
    private Label lbl6 = new Label("Delete Firecat browser: ");

    private Button btn7 = new Button("Watch ");
    private Button btn8 = new Button("Delete ");
    private Label lbl7 = new Label("Watch film: ");
    private Label lbl8 = new Label("Delete film: ");

    private Label lbl9 = new Label("Film name: ");
    private Label lbl10 = new Label(" ");
    private Label lbl11 = new Label("Return to player: ");
    private Button btn9 = new Button("Return");

    public void setGrid1() {
        GridPane grid = new GridPane();
        stage.setWidth(340);
        stage.setHeight(150);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(lbl1, HPos.LEFT);
        grid.add(lbl1,0,0);

        GridPane.setHalignment(btn1, HPos.LEFT);
        grid.add(btn1,1,0);

        GridPane.setHalignment(lbl2, HPos.LEFT);
        grid.add(lbl2,0,1);

        GridPane.setHalignment(btn2, HPos.LEFT);
        grid.add(btn2,1,1);
        btn1.setPrefHeight(14);
        btn2.setPrefWidth(88);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("UI");
        stage.show();
    }
    public void setGrid2() {
        GridPane grid = new GridPane();
        stage.setWidth(350);
        stage.setHeight(150);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(lbl3, HPos.LEFT);
        grid.add(lbl3,0,0);

        GridPane.setHalignment(btn3, HPos.LEFT);
        grid.add(btn3,1,0);
        btn3.setPrefWidth(145);

        GridPane.setHalignment(lbl4, HPos.LEFT);
        grid.add(lbl4,0,1);

        GridPane.setHalignment(btn4, HPos.LEFT);
        grid.add(btn4,1,1);
        btn4.setPrefWidth(145);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Expander Browser");
        stage.show();
    }
    public void setGrid3() {
        GridPane grid = new GridPane();
        stage.setWidth(300);
        stage.setHeight(150);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(lbl5, HPos.LEFT);
        grid.add(lbl5,0,0);

        GridPane.setHalignment(btn5, HPos.LEFT);
        grid.add(btn5,1,0);

        GridPane.setHalignment(lbl6, HPos.LEFT);
        grid.add(lbl6,0,1);

        GridPane.setHalignment(btn6, HPos.LEFT);
        grid.add(btn6,1,1);
        btn6.setPrefWidth(88);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Computer");
        stage.show();
    }
    public void setGrid4() {
        GridPane grid = new GridPane();
        stage.setWidth(300);
        stage.setHeight(150);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(lbl7, HPos.LEFT);
        grid.add(lbl7,0,0);

        GridPane.setHalignment(btn7, HPos.LEFT);
        grid.add(btn7,1,0);
        btn7.setPrefWidth(160);

        GridPane.setHalignment(lbl8, HPos.LEFT);
        grid.add(lbl8,0,1);

        GridPane.setHalignment(btn8, HPos.LEFT);
        grid.add(btn8,1,1);
        btn8.setPrefWidth(160);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Video player");
        stage.show();
    }
    public void setGrid5(Program p) {
        GridPane grid = new GridPane();
        stage.setWidth(260);
        stage.setHeight(130);
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(10, 10, 10, 10));

        GridPane.setHalignment(lbl9, HPos.LEFT);
        grid.add(lbl9, 0, 0);
        //lbl9.setPrefWidth(100);

        lbl10.setText(p.getName());
        GridPane.setHalignment(lbl10, HPos.LEFT);
        grid.add(lbl10, 1, 0);
        //lbl9.setPrefWidth(100);

        GridPane.setHalignment(lbl11, HPos.LEFT);
        grid.add(lbl11, 0, 1);

        GridPane.setHalignment(btn9, HPos.LEFT);
        grid.add(btn9, 1, 1);

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Film");
        stage.show();
    }
    public void setDownloadBrowserEvent (EventHandler<ActionEvent> handle){
        btn1.setOnAction(handle);
    }
    public void setExitEvent (EventHandler<ActionEvent> handle){
        btn2.setOnAction(handle);
    }
    public void setInstallBrowserEvent (EventHandler<ActionEvent> handle){
        btn3.setOnAction(handle);
    }
    public void setCancelInstallationEvent (EventHandler<ActionEvent> handle){
        btn4.setOnAction(handle);
    }
    public void setDownloadFilmEvent (EventHandler<ActionEvent> handle){
        btn5.setOnAction(handle);
    }
    public void setDeleteBrowserEvent (EventHandler<ActionEvent> handle){
        btn6.setOnAction(handle);
    }
    public void setWatchFilmEvent (EventHandler<ActionEvent> handle){
        btn7.setOnAction(handle);
    }
    public void setDeleteFilmEvent (EventHandler<ActionEvent> handle){
        btn8.setOnAction(handle);
    }
    public void setReturnToPlayerEvent (EventHandler<ActionEvent> handle){
        btn9.setOnAction(handle);
    }
}

