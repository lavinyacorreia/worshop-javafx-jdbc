package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.gui.Constraints;

public class DepartmentFormController implements Initializable {

	@FXML
	private TextField txtId;
	@FXML
	private TextField txtName;
	@FXML
	private Label labelError;
	
	@FXML
	private Button btSave;

	@FXML
	private Button btCancel;
	
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("Funfou");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("Funfou2");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}

}
