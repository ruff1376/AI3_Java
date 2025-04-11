module JavaFX_Board {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires lombok;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
	opens application.Controller to javafx.base, javafx.fxml;
	opens application.DTO to javafx.base;
}
