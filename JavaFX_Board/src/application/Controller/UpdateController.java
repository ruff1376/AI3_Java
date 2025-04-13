package application.Controller;

import java.io.IOException;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.Util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateController {

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;
    
    @FXML
    private TextArea taContent;
    
    private BoardService boardService = new BoardServiceImpl();
    
    int no;

	// 글읽기 처리
	public void read(int no) {
		this.no = no;
		Board board = boardService.select(no);
		tfTitle.setText(board.getTitle());
		tfWriter.setText(board.getWriter());
		taContent.setText(board.getContent());
	}
	
	// 목록 화면 이동
	public void moveToList(ActionEvent event) throws IOException {
		SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
	}
	
	// 글 삭제 처리
	public void delete(ActionEvent event) throws IOException {
		// 글 삭제 전 삭제 알림 창 표시
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("게시글 삭제");
		alert.setHeaderText("게시글을 삭제하시겠습니까? (글 번호 : " + no + ")");
		
		int result = 0;
		// 확인 시 삭제
		if (alert.showAndWait().get() == ButtonType.OK) {
			result = boardService.delete(no);
		}
		if (result > 0) {
			System.out.println("삭제가 완료되었습니다.");
			SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
		}
	}
	
	// 글 수정 처리
	public void update(ActionEvent event) throws IOException {
		Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
		board.setNo(no);
		
		int result = boardService.update(board);
		if (result > 0) {
			System.out.println("수정이 완료되었습니다.");
			SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
		}
	}
	
}
