package Lab9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    TextField tfNum1;
    TextField tfNum2;
    Button btnDivide;
    Button btnClear;
    Label lblAnswer;

    @Override
    public void start(Stage primaryStage) {

        tfNum1 = new TextField();
        tfNum2 = new TextField();
        btnDivide = new Button("/");
        btnClear = new Button("Clear");
        lblAnswer = new Label("Result");

        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        root.setHgap(10);
        root.setVgap(10);

        root.add(btnDivide, 0, 0);
        root.add(btnClear, 0, 4, 2, 1);

        root.add(tfNum1, 0, 2);
        root.add(tfNum2, 1, 2);
        root.add(lblAnswer, 0, 3, 2, 1);

        setWidths();
        attachCode();

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setWidths() {
        tfNum1.setPrefWidth(70);
        tfNum2.setPrefWidth(70);
        btnDivide.setPrefWidth(70);
        btnClear.setPrefWidth(150);
        lblAnswer.setPrefWidth(150);
    }

    public void attachCode() {
        btnDivide.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
    }

    public void btncode(ActionEvent e) {
        int num1, num2, answer = 0;
        char symbol = 0;
        if (e.getSource() == btnClear) {
            tfNum1.setText("");
            tfNum2.setText("");
            lblAnswer.setText("Result");
            tfNum1.requestFocus();
            return;
        }

        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        if (e.getSource() == btnDivide) {
            symbol = '/';
            answer = num1 / num2;
        }

        lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
    }

    public static void main(String[] args) {
        launch(args);
    }
}