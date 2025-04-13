package application.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.CheckBox;
import lombok.Data;

/**
 *  (DTO)
 *  게시글 정보		
 *  				Java			DB
 *  - 게시글 번호		no				no	
 *  - 제목			title			title
 *  - 작성자			writer			writer
 *  - 내용			content			content
 *  - 등록일자			createdAt		created_at
 *  - 수정일자			updatedAt		updated_at
 */
@Data
public class Board {

	private int no;
	private String title;
	private String writer;
	private String content;
	private String createdAt;
	private String updatedAt;
	private CheckBox cbDelete;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public Board() {
		this("제목 없음", "작성자 없음", "내용 없음");
	}

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.createdAt = dateFormat.format(new Date());
		this.updatedAt = dateFormat.format(new Date());
		this.cbDelete = new CheckBox();
	}
	
}
