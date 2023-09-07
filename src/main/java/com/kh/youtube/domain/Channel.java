package com.kh.youtube.domain;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Channel {
	private int channelCode;
	private String channelName;
	private String channelPhoto;
	private String channelDesc;
	private Date channelDate;

	@ManyToOne // 다대일관계 설정.(하나의 멤버가 여러채널을 가지고 있당)
	@JoinColumn(name="member_id") // 외래키 생성 or Member 엔티티의 기본키와 매핑
	private Member member;

}