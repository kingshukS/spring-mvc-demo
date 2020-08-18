package com.kingshuk.spring.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapUtil {

	@Bean("countryOptions")
	public Map<String,String> countryOptions(){
		Map<String,String> countryOptions = new LinkedHashMap<>();
		countryOptions.put("Argentina", "Argentina");
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("Colombia", "Colombia");
		countryOptions.put("Denmark", "Denmark");
		
		return countryOptions;	
	}
	
	@Bean("languageOptions")
	public Map<String,String> languageOptions(){
		Map<String,String> languageOptions = new LinkedHashMap<>();
		languageOptions.put("Java", "Java");
		languageOptions.put("C#", "C#");
		languageOptions.put("C", "C");
		languageOptions.put("Python", "Python");
		
		return languageOptions;	
	}
	
	@Bean("osOptions")
	public Map<String,String> osOptions(){
		Map<String,String> osOptions = new LinkedHashMap<>();
		osOptions.put("Linux", "Linux");
		osOptions.put("Mac OS X", "Mac OS X");
		osOptions.put("Windows 10", "Windows 10");
		osOptions.put("RedHat", "RedHat");
		
		return osOptions;	
	}
}
