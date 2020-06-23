package com.biz.daum;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie 
{
	public static void main(String[] args) throws Exception 
	{
		String score = "";
		String userId = "";
		String reply = "";
		String day = "";
		
		String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=1";
		Document doc = Jsoup.connect(url).get();
		Elements replyList = doc.select("div.main_detail > ul > li");
		
		
		for(Element one : replyList)
		{
			userId  = one.select("em.link_profile").text();
			score = one.select("em.emph_grade").text();
			reply  = one.select("p.desc_review").text();
			day    = one.select("span.info_append").text();
			
			System.out.println("이름 : " + userId + "\t\t평점 : " + score);
			System.out.println("내용 : " + reply);
			System.out.println("날짜 :" + day);
			System.out.println("========================================");
			
		}
		
		
		
	}
}
