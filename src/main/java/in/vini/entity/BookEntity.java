package in.vini.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_book")
public class BookEntity {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
}
