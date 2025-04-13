package application.Controller;

import java.io.IOException;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.Util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfWriter;
    
    @FXML
    private TextArea taContent;
    
    private BoardService boardService = new BoardServiceImpl();
	
    /**
     * 목록 화면으로 이동
     * : 목록 버튼 클릭 시 메인 화면으로 이동
     * @param event
     * @throws IOException
     */
	public void moveToList(ActionEvent event) throws IOException {
		SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
	}
	
	/**
	 * 글 쓰기 처리
	 * : 제목, 작성자, 내용을 입력하고 등록 버튼 클릭 시 글 등록
	 * @param event
	 * @throws IOException
	 */
	public void insert(ActionEvent event) throws IOException {
		Board board = new Board(tfTitle.getText(), tfWriter.getText(), taContent.getText());
		int result = boardService.insert(board);
		if (result > 0) {
			System.out.println("등록이 완료되었습니다.");
			SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
		}
	}

}
