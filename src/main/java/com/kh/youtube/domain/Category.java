package com.kh.youtube.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

	@Id // pk
	@Column(name="category_code") // 테이블 컬럼명과 다르기 때문에 적어줘야함
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "categorySequence") // id를 하나씩 자동 생성 해주겠다. 아래에 있는 부분을 명시를 해줘야함
	@SequenceGenerator(name="categorySequence", sequenceName = "SEQ_CATEGORY", allocationSize = 1) // sequence 만들어놔서 사용, 1씩 증가 시키겠다
	private int categoryCode;

	@Column(name="category_name") // 테이블 컬럼명과 변수명이 다르기 때문에 적어줘야함
	private String categoryName;

}
