package com.site.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private float avr;
	
	public void calculate() {
        this.total = kor + eng + math;
        this.avr = total / 3f;
    }

}
