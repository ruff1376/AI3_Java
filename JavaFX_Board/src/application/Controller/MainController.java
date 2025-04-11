package application.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
    private TableView<Board> boardTableView;

    @FXML
    private TableColumn<Board, Integer> colBoardNo;
    
    @FXML
    private TableColumn<Board, String> colTitle;
    
    @FXML
    private TableColumn<Board, String> colWriter;

    @FXML
    private TableColumn<Board, String> colCreatedAt;

    @FXML
    private TableColumn<Board, String> colUpdatedAt;
	
	BoardService boardService = new BoardServiceImpl();
	
	Stage stage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 데이터 초기화
		List<Board> boardList = new ArrayList<>();
		boardList = boardService.list();
		
		for (Board board : boardList) {
			System.out.println(board);
		}
		
		ObservableList<Board> list = FXCollections.observableArrayList(boardList);
		
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colCreatedAt.setCellValueFactory(new PropertyValueFactory<>("CreatedAt"));
		colUpdatedAt.setCellValueFactory(new PropertyValueFactory<>("UpdatedAt"));
		
		// TableView에 데이터 리스트 지정
		boardTableView.setItems(list);
		
		
		
	}
	
	/**
	 * 프로그램 종료
	 * @param event
	 */
	public void close(ActionEvent event) {
		System.out.println("프로그램을 종료합니다...");
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}

}
