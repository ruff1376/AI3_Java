package application.Controller;

/**
 * .fxml 파일 경로를 미리 지정하여 사용할 수 있도록 UI enum 정의
 */
public enum UI {
	
	MAIN("/application/Main.fxml"),
	INSERT("/application/UI/Insert.fxml"),
	READ("/application/UI/Read.fxml"),
	UPDATE("/application/UI/Update.fxml");
	
	private final String path;
	
	UI(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

}
