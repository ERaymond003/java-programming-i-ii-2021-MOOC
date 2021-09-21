package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private int turnCounter;
    private boolean finished;
    private Label turn;
    private Button[] buttons;

    public TicTacToeApplication() {
        this.turnCounter = 0;
        this.finished = false;
        this.turn = new Label("Turn: X");
        this.buttons = new Button[9];
        for (int i = 0; i < 9; i++) {
            this.buttons[i] = createButton();
        };
    }

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();
        layout.setPrefSize(310, 350);
        this.turn.setFont(new Font(30.0));

        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        grid.add(buttons[0], 0, 0);
        grid.add(buttons[1], 0, 1);
        grid.add(buttons[2], 0, 2);
        grid.add(buttons[3], 1, 0);
        grid.add(buttons[4], 1, 1);
        grid.add(buttons[5], 1, 2);
        grid.add(buttons[6], 2, 0);
        grid.add(buttons[7], 2, 1);
        grid.add(buttons[8], 2, 2);

        layout.setTop(this.turn);
        layout.setCenter(grid);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

    public Button createButton() {
        Button btn = new Button(" ");
        btn.setFont(new Font("Monospaced", 40));
        btn.setPrefSize(90, 90);

        btn.setOnAction((event) -> {
            if (this.finished) {
                return;
            }

            if (!btn.getText().equals(" ")) {
                return;
            }

            if (this.turnCounter == 0 || this.turnCounter % 2 == 0) {
                btn.setText("X");
                this.turn.setText("Turn: O");
                this.turnCounter++;
            } else {
                btn.setText("O");
                this.turn.setText("Turn: X");
                this.turnCounter++;
            }

            if (gameScratched() || gameWon()) {
                this.turn.setText("The end!");
                this.finished = true;
            }
        });

        return btn;
    }

    public boolean gameScratched() {
        if (!buttons[0].getText().equals(" ")
                && !buttons[1].getText().equals(" ")
                && !buttons[2].getText().equals(" ")
                && !buttons[3].getText().equals(" ")
                && !buttons[4].getText().equals(" ")
                && !buttons[5].getText().equals(" ")
                && !buttons[6].getText().equals(" ")
                && !buttons[7].getText().equals(" ")
                && !buttons[8].getText().equals(" ")) {
            return true;
        }
        return false;
    }

    public boolean gameWon() {
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
                return true;
            }
        }
        if (!buttons[3].getText().equals(" ")) {
            if (buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())) {
                return true;
            }
        }
        if (!buttons[6].getText().equals(" ")) {
            if (buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        if (!buttons[1].getText().equals(" ")) {
            if (buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())) {
                return true;
            }
        }

        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())) {
                return true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
