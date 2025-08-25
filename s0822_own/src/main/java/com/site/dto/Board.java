package com.site.dto;



import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	private int bno; // blist, bview
	private String btitle; // blist, bview
	private String id; // blist, bview
	private String bcontent; // bview
	
	private Timestamp bdate; // blist, bview
	private int bhit; // blist, bview
	private String bfile; // bview
	
	// comment
	private int bgroup; 
	private int bindent; 
	private int bstep; 
	
}
