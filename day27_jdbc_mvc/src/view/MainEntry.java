package view;

import java.io.IOException;
import java.sql.SQLException;

import controller.GiftController;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws SQLException, IOException {
//		ConnectionHelper.getConnection("oracle","tw","oracle");
//		ConnectionHelper.menu();
		
		GiftController.connect();
		GiftController.menu();
		
	}
}
