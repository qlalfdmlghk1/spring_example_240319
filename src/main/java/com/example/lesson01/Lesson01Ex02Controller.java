package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// HTML 화면으로 보내는 컨트롤러
@Controller // @ResponseBody가 있으면 안 된다!!
public class Lesson01Ex02Controller {
	
	// http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")  // 주소 경로
	public String ex02() {
		// return 되는 String은 html의 경로이다.(@ResponseBody가 없을 때)
		
		// return "           lesson01/ex02";     이렇게만 써도 된다.
		// return "/templates/lesson01/ex02.html"
		return "lesson01/ex02"; // responser html view 경로
	}
}