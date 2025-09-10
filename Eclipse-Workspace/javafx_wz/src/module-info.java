module javafx_wz {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru to javafx.graphics, javafx.fxml;
}
