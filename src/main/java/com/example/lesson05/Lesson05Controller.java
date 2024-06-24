package com.example.lesson05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex1() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex2(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("멜론");
		fruits.add("복숭아");
		fruits.add("포도");
		fruits.add("수박");
		model.addAttribute("fruits",fruits);
		
		// List<Map<String, Object>>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "홍길동");
		user.put("age", 30);
		user.put("hobby", "영화");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "유재석");
		user.put("age", 26);
		user.put("hobby", "요가");
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		
		LocalDate localDate = LocalDate.now();
		model.addAttribute("localDate", localDate);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		model.addAttribute("localDateTime", localDateTime);
		
		// UTC 표준시
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		model.addAttribute("zonedDateTime", zonedDateTime);
		
		return "lesson05/ex03";	
	}
}