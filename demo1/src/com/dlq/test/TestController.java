package com.dlq.test;

import com.dlq.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

@RestController
public class TestController {

	/**
	 * 假设：localhost:8080/demo1/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(@RequestBody Map map) throws UnsupportedEncodingException {
		//System.out.println(URLDecoder.decode(book, "utf-8"));
		System.out.println(map);
		System.out.println(map.get("name"));
		System.out.println(map.get("price"));
		System.out.println(map.get("author"));
		return "success";
	}

	@RequestMapping("/hello2")
	public String hello2(@RequestBody Book book) throws UnsupportedEncodingException {
		System.out.println(book);
		return "success";
	}
}
