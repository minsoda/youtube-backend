package com.kh.youtube.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert // 어노테이션을 작성해줘야 디폴트로 설정한 값 들어갈수있다.
public class Member {

	@Id
	private String id;

	@Column
	private String password;

	@Column
	private String name;

	@Column
	private String authority;


}
