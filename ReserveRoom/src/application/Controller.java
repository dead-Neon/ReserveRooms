package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField fname, lname, room;
	@FXML
	private ComboBox arriveDate, leaveDate;
	
	
	@FXML
	public void addBooking()
	{
		Main.getRooms().get(Integer.parseInt(room.getText()));
	}
	
	@FXML
	public void cancelBooking()
	{
		
	}

}
