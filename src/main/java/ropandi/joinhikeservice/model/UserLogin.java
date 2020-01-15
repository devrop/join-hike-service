package ropandi.joinhikeservice.model;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLogin {

	    private  String id;
	    private String name;
	    private String email;
	    private String password;
	    private String bithdate;
	    @JsonProperty("phone_number")
	    private String phoneNumber;
	    private Integer status;
	    private String createdDate;
	    private Long createdBy;
	    private String updatedDate;
	    private Long updatedBy;
	    
	    private String token;

		public  String getId() {
			return id;
		}

		public void setId( String id) {
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getBithdate() {
			return bithdate;
		}

		public void setBithdate(String bithdate) {
			this.bithdate = bithdate;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}

		public Long getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(Long createdBy) {
			this.createdBy = createdBy;
		}

		public String getUpdatedDate() {
			return updatedDate;
		}

		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}

		public Long getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Long updatedBy) {
			this.updatedBy = updatedBy;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}
	    
	    

	    
	    
}
