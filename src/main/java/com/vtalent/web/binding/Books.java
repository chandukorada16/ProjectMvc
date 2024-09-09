package com.vtalent.web.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor//@Getter
public class Books {
	
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

}
