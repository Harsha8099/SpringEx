package com.springwithjavaconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "File_Update_Details")
public class FIleUpdateDetails {
	@Id
	@Column(name="id")
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_TYPE")
	private String userType;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MIDDLE_NAME")
	private String middleName;
	@Column(name="primary_education_college_name")
	private String primaryEducationCollegeName;
	@Column(name="primary_education_school_names")
	private String primaryEducationSchoolName;
	@Column(name="WORK_AUTHORIZATION_NAME")
	private String workAuthorizationName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="ETHNICITY")
	private String ethnicity;
	@Column(name="primary_education_currently_attending")
	private String primaryEducationCurrentlyAttending;
	@Column(name="AUTH_IDENTIFIER")
	private String authIdentifier;
	@Column(name="primary_education_end_date")
	private String primaryEducationEndDate;
	@Column(name="school_year_name")
	private String schholYearName;
	@Column(name="primary_education_education_level_name")
	private String primaryEducationLevelName;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPrimaryEducationCollegeName() {
		return primaryEducationCollegeName;
	}

	public void setPrimaryEducationCollegeName(String primaryEducationCollegeName) {
		this.primaryEducationCollegeName = primaryEducationCollegeName;
	}

	public String getPrimaryEducationSchoolName() {
		return primaryEducationSchoolName;
	}

	public void setPrimaryEducationSchoolName(String primaryEducationSchoolName) {
		this.primaryEducationSchoolName = primaryEducationSchoolName;
	}

	public String getWorkAuthorizationName() {
		return workAuthorizationName;
	}

	public void setWorkAuthorizationName(String workAuthorizationName) {
		this.workAuthorizationName = workAuthorizationName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getPrimaryEducationCurrentlyAttending() {
		return primaryEducationCurrentlyAttending;
	}

	public void setPrimaryEducationCurrentlyAttending(String primaryEducationCurrentlyAttending) {
		this.primaryEducationCurrentlyAttending = primaryEducationCurrentlyAttending;
	}

	public String getAuthIdentifier() {
		return authIdentifier;
	}

	public void setAuthIdentifier(String authIdentifier) {
		this.authIdentifier = authIdentifier;
	}

	public String getPrimaryEducationEndDate() {
		return primaryEducationEndDate;
	}

	public void setPrimaryEducationEndDate(String primaryEducationEndDate) {
		this.primaryEducationEndDate = primaryEducationEndDate;
	}

	public String getSchholYearName() {
		return schholYearName;
	}

	public void setSchholYearName(String schholYearName) {
		this.schholYearName = schholYearName;
	}

	public String getPrimaryEducationLevelName() {
		return primaryEducationLevelName;
	}

	public void setPrimaryEducationLevelName(String primaryEducationLevelName) {
		this.primaryEducationLevelName = primaryEducationLevelName;
	}

}
