package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	
	@FXML
	Button b00, b01, b02, b10, b11, b12, b20, b21, b22;
	
	@FXML
	MenuItem cp;
	
	private boolean p1 = true;
	private boolean p2 = false;
	
	@FXML
	public void initialize() {
	}
	
	@FXML
	void checkPlay(ActionEvent event) {
		Button currentButton = (Button) event.getSource();
		if (p1) {
			currentButton.setText("X");
			currentButton.setDisable(true);
			checkVictory();
			changePlayer();
		}
		else {
			currentButton.setText("O");
			currentButton.setDisable(true);
			checkVictory();
			changePlayer();
		}
	}
	
	private void checkVictory() {
		String winner = p1 ? "Player 2" : "Player 1";
		Alert  alert  = null;
		if (b00.getText()
		       .equals(b01.getText()) && b01.getText()
		                                    .equals(b02.getText()) && !b00.getText()
		                                                                  .isEmpty() && !b01.getText()
		                                                                                    .isEmpty() &&
				!b02.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b10.getText()
		            .equals(b11.getText()) && b11.getText()
		                                         .equals(b12.getText()) && !b10.getText()
		                                                                       .isEmpty() && !b11.getText()
		                                                                                         .isEmpty() &&
				!b12.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b20.getText()
		            .equals(b21.getText()) && b21.getText()
		                                         .equals(b22.getText()) && !b20.getText()
		                                                                       .isEmpty() && !b21.getText()
		                                                                                         .isEmpty() &&
				!b22.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b00.getText()
		            .equals(b10.getText()) && b10.getText()
		                                         .equals(b20.getText()) && !b00.getText()
		                                                                       .isEmpty() && !b10.getText()
		                                                                                         .isEmpty() &&
				!b20.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b01.getText()
		            .equals(b11.getText()) && b11.getText()
		                                         .equals(b21.getText()) && !b01.getText()
		                                                                       .isEmpty() && !b11.getText()
		                                                                                         .isEmpty() &&
				!b21.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b02.getText()
		            .equals(b12.getText()) && b12.getText()
		                                         .equals(b22.getText()) && !b02.getText()
		                                                                       .isEmpty() && !b12.getText()
		                                                                                         .isEmpty() &&
				!b22.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b00.getText()
		            .equals(b11.getText()) && b11.getText()
		                                         .equals(b22.getText()) && !b00.getText()
		                                                                       .isEmpty() && !b11.getText()
		                                                                                         .isEmpty() &&
				!b22.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else if (b20.getText()
		            .equals(b11.getText()) && b11.getText()
		                                         .equals(b02.getText()) && !b20.getText()
		                                                                       .isEmpty() && !b11.getText()
		                                                                                         .isEmpty() &&
				!b02.getText()
				    .isEmpty()) {
			alert = new Alert(Alert.AlertType.INFORMATION,
			                  "Congratulations, " + winner + " just won the game!");
			reset();
		}
		else {
			if (!b00.getText()
			        .isEmpty() && !b01.getText()
			                          .isEmpty() && !b02.getText()
			                                            .isEmpty() && !b10.getText()
			                                                              .isEmpty() && !b11.getText()
			                                                                                .isEmpty() &&
					!b12.getText()
					    .isEmpty
							    () && !b20.getText()
					                      .isEmpty() && !b21.getText()
					                                        .isEmpty() && !b22.getText()
					                                                          .isEmpty())
				alert = new Alert(Alert.AlertType.INFORMATION,
				                  "It's a Draw");
			reset();
		}
		if (alert != null) {
			alert.showAndWait();
		}
	}
	@FXML
	private void reset() {
		b00.setText("");
		b00.setDisable(false);
		b01.setText("");
		b01.setDisable(false);
		b02.setText("");
		b02.setDisable(false);
		b10.setText("");
		b10.setDisable(false);
		b11.setText("");
		b11.setDisable(false);
		b12.setText("");
		b12.setDisable(false);
		b20.setText("");
		b20.setDisable(false);
		b21.setText("");
		b21.setDisable(false);
		b22.setText("");
		b22.setDisable(false);
	}
	
	@FXML
	void exit() {
		System.exit(0);
	}
	@FXML
	void about() {
		Alert alert = new Alert(Alert.AlertType.NONE);
		alert.setTitle("About");
		alert.setContentText("This game was quickly created to kill some boring time. Hope you enjoy");
		alert.getButtonTypes()
		     .add(ButtonType.CLOSE);
		alert.showAndWait();
	}
	
	private void changePlayer() {
		p1 = !p1;
		p2 = !p2;
		if (p1) {
			cp.setText("Current Player: Player 1");
		}
		else {
			cp.setText("Current Player: Player 2");
		}
	}
}
