module JavaFX_Board {
	requires javafx.controls;
	requires java.sql;
	requires lombok;
	opens application to javafx.graphics, javafx.fxml;
}
