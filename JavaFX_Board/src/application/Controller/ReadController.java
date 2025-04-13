package application.Controller;

import java.io.IOException;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import application.Util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReadController {

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
    	
    	// 게시글 읽기 요청
    	Board board = boardService.select(no);
    	tfTitle.setText(board.getTitle());
    	tfWriter.setText(board.getWriter());
    	taContent.setText(board.getContent());
    }
    
    // 목록 버튼 클릭 시 목록 화면 이동
    public void moveToList(ActionEvent event) throws IOException {
    	SceneUtil.getInstance().switchScene(event, UI.MAIN.getPath());
    }
    
    // 수정 버튼 클릭 시 수정 화면 이동
    public void moveToUpdate(ActionEvent event) throws IOException {
    	UpdateController updateController = (UpdateController) SceneUtil.getInstance().getController(UI.UPDATE.getPath());
    	updateController.read(no);
    	Parent root = SceneUtil.getInstance().getRoot();
    	SceneUtil.getInstance().switchScene(event, UI.UPDATE.getPath(), root);
    }

}
