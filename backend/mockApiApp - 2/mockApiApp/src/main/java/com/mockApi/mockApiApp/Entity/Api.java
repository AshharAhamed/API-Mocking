package com.mockApi.mockApiApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "api")
public class Api {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String apiName;
	@Column(unique=true)
	private String url;
	private Integer responseHeaderStatusCode;
	
	public Api(Integer id, String apiName, String url, Integer responseHeaderStatusCode) {
		super();
		this.id = id;
		this.apiName = apiName;
		this.url = url;
		this.responseHeaderStatusCode = responseHeaderStatusCode;
	}

	public Api() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getResponseHeaderStatusCode() {
		return responseHeaderStatusCode;
	}

	public void setResponseHeaderStatusCode(Integer responseHeaderStatusCode) {
		this.responseHeaderStatusCode = responseHeaderStatusCode;
	}
	
}
