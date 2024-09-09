package com.vtalent.web.binding;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@Getter
@AllArgsConstructor//RequiredConstructor
public class Books {
	
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

}
