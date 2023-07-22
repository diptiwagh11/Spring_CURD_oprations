package com.rt.Spring.Entity;

public class JobsEntity {
     private int id;
	private String name;
	private String email;
	private String countrycode;
	private String mobile;
	private String jobs;
	private String password;
	private String repassword;

	public JobsEntity() {

	}

	public JobsEntity(int id, String name, String email, String countrycode, String mobile, String jobs,
			String password, String repassword) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.countrycode = countrycode;
		this.mobile = mobile;
		this.jobs = jobs;
		this.password = password;
		this.repassword = repassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	

	
	
	
}
