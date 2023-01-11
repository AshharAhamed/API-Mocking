package com.mockApi.mockApiApp.Service.ServiceImpl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.mockApi.mockApiApp.Service.ApiService;

@Service
public class ApiServiceImpl implements ApiService {

	@Override
	public void validateApiFromUrl (String URL) {
		
		String domain = "localhost:8080";
		String[] urlArray = URL.split(domain);
		System.out.println("DEBUG>> URL from Services ==> ");
		System.out.println(urlArray[1]);
		
		String urlWithoutDomain = urlArray[1];
		String[] urlWithoutDomainArr = urlWithoutDomain.split("/");
		
		System.out.println("DEBUG>> Project Arr  ==> ");
		System.out.println(Arrays.toString(urlWithoutDomainArr));
	}
	
	public void getProjectFromUrl () {
		
	}
}
