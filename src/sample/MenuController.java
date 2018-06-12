package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button pvpButton;

    @FXML
    private Button pveButton;

    @FXML
    private Button eveButton;

    @FXML
    void initialize() {
        pvpButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            Parent root = null;
            try {
                Stage stage = new Stage();
                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                stage.setTitle("Renju");
                stage.setScene(new Scene(root, 800, 800));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Controller.mode = 0;
            for (int i = 0; i < Mover.board.length; i++) {
                for (int j = 0; j < Mover.board[i].length; j++) {
                    Mover.board[i][j] = 0;
                }
            }
        });
        pveButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            Parent root = null;
            try {
                Stage stage = new Stage();
                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                stage.setTitle("Renju");
                stage.setScene(new Scene(root, 800, 800));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Controller.mode = 1;
            for (int i = 0; i < Mover.board.length; i++) {
                for (int j = 0; j < Mover.board[i].length; j++) {
                    Mover.board[i][j] = 0;
                }
            }
        });
        eveButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            Parent root = null;
            try {
                Stage stage = new Stage();
                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                stage.setTitle("Renju");
                stage.setScene(new Scene(root, 800, 800));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Controller.mode = 3;
            for (int i = 0; i < Mover.board.length; i++) {
                for (int j = 0; j < Mover.board[i].length; j++) {
                    Mover.board[i][j] = 0;
                }
            }
        });
    }
}
