package com.mockApi.mockApiApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mockApi.mockApiApp.Entity.Api;
import com.mockApi.mockApiApp.Repository.ApiRepository;
import com.mockApi.mockApiApp.Service.ApiService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MockApiController {
	
	@Autowired
	private ApiRepository apiRepository;
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/**")
    public String handleRequests(HttpServletRequest request) {
		String fullUrl = request.getRequestURL().toString() /* + "?" + request.getQueryString() */;
        // do something with the full URL
        
        System.out.print("\nDEBUG>> fullUrl is =====> " + fullUrl);
        return "index";
    }

	@GetMapping("/**")
	public @ResponseBody Iterable<Api> getMethodeHandler(HttpServletRequest request) {
		String url1 = request.getRequestURL().toString();
		
		apiService.validateApiFromUrl(url1);
		
		String domainWithProj = "localhost:8080/Claro";
		String[] urlArr = url1.split(domainWithProj);
		System.out.println("DEBUG>> urlArr Object is => ");
		System.out.println(urlArr[1]);
		System.out.println("DEBUG>> Request Object is => ");
		System.out.println(request.getQueryString());
		System.out.println("DEBUG>> Hello Ashhar");
	    System.out.println("DEBUG>> URL is =====> " + url1);
	    return apiRepository.findByUrl(urlArr[1]);
	}
	
	@GetMapping("/hellow/{url}")
	public void getPathValue(@PathVariable String url, HttpServletRequest request) {
		System.out.print("DEBUG> Entered URL is => " + url);
		String url1 = request.getRequestURL().toString();
	    System.out.print("\nDEBUG>> URL is =====> " + url1);
		
	}
	
	@RequestMapping("/some-path")
    public String handleRequest(HttpServletRequest request) {
        String requestedUrl = request.getRequestURI();
        // do something with the requested URL
        return requestedUrl;
    }
}
