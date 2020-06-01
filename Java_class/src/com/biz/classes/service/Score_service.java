package com.biz.classes.service;

import com.biz.classes.model.Score_VO;

// 오버로딩 : 매개변수 개수, type or method type  다르면 성립

public class Score_service 
{
	// 오버로딩 ==================================
	public int sum()
	{
		return 0;
	}
	
	public int sum(Score_VO score) // Score클래스를 매개변수로 받는 method
	{
		int sum = score.getIkor() + score.getIeng() + score.getIart() + score.getIsci() + score.getImusic() + score.getImath();
		score.setIsum(sum);
		score.setIavg(sum / 6);
		return sum;
	}
	
	public int sum(int kor, int eng, int math, int music, int art, int sci)
	{
		int sum = kor + eng + math + music + art + sci;
		return sum;
	}
	
	public int sum(int kor, int eng)
	{
		return kor+eng;
	}

	public int sum(int kor, int eng, int math)
	{
		int sum = kor+eng+math;
		return sum;
	}
	
	public float sum(float kor, int eng)
	{
		return kor+eng;
	}

	public float sum(float kor, float eng, float math)
	{
		float sum = kor+eng+math;
		return sum;
	}
	
	// =========================================
}
