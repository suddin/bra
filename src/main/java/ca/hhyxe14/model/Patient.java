package ca.hhyxe14.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.appfuse.model.BaseObject;
import org.appfuse.model.User;

@Entity
@Table(name="patient")
public class Patient extends BaseObject {
	private static final long serialVersionUID = 3425551541154917382L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long patientId;
	
	@OneToOne (cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private User user;
	
	@Column
	private String gender;
	
	@Column
	private String dob;
	
	@Column
	private String bloodGroup;
	
	@Column
    private String healthCardNumber;
    
    @Column
    private String emergencyContactName;
   
    @Column
    private String emergencyContactPhone;
    
    @Column
    private String allergies;
    
    @Column
    private String medicalCondition ;    
    
    @Column
    private String bioId;    
    
    @Column
    private Integer organDonorStatus;    
    
    @Column
    private String nextToKinContactNumber;  
    
    @Column
    private String nextToKin;
    
    @Column
    private String legalProxies; 
    
    @Column
    private String legalProxiesContactNumber; 
    
    
    public Integer getOrganDonorStatus() {
		return organDonorStatus;
	}

	public void setOrganDonorStatus(Integer organDonorStatus) {
		this.organDonorStatus = organDonorStatus;
	}

	public String getNextToKinContactNumber() {
		return nextToKinContactNumber;
	}

	public void setNextToKinContactNumber(String nextToKinContactNumber) {
		this.nextToKinContactNumber = nextToKinContactNumber;
	}

	public String getNextToKin() {
		return nextToKin;
	}

	public void setNextToKin(String nextToKin) {
		this.nextToKin = nextToKin;
	}

	public String getLegalProxies() {
		return legalProxies;
	}

	public void setLegalProxies(String legalProxies) {
		this.legalProxies = legalProxies;
	}

	public String getLegalProxiesContactNumber() {
		return legalProxiesContactNumber;
	}

	public void setLegalProxiesContactNumber(String legalProxiesContactNumber) {
		this.legalProxiesContactNumber = legalProxiesContactNumber;
	}

	/**
     * Default constructor - creates a new instance with no values set.
     */
    public Patient() {}

    /**
     * Create a new instance and set the username.
     * @param username login name for user.
     */
    
    public User getUser() {
		return user;
	}

	public String getBioId() {
		return bioId;
	}

	public void setBioId(String bioId) {
		this.bioId = bioId;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getHealthCardNumber() {
		return healthCardNumber;
	}

	public void setHealthCardNumber(String healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime * ((allergies == null) ? 0 : allergies.hashCode());
		result = prime * result
				+ ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime
				* result
				+ ((emergencyContactName == null) ? 0 : emergencyContactName
						.hashCode());
		result = prime
				* result
				+ ((emergencyContactPhone == null) ? 0 : emergencyContactPhone
						.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime
				* result
				+ ((healthCardNumber == null) ? 0 : healthCardNumber.hashCode());
		result = prime
				* result
				+ ((medicalCondition == null) ? 0 : medicalCondition.hashCode());
		result = prime * result
				+ ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (allergies == null) {
			if (other.allergies != null)
				return false;
		} else if (!allergies.equals(other.allergies))
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (emergencyContactName == null) {
			if (other.emergencyContactName != null)
				return false;
		} else if (!emergencyContactName.equals(other.emergencyContactName))
			return false;
		if (emergencyContactPhone == null) {
			if (other.emergencyContactPhone != null)
				return false;
		} else if (!emergencyContactPhone.equals(other.emergencyContactPhone))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (healthCardNumber == null) {
			if (other.healthCardNumber != null)
				return false;
		} else if (!healthCardNumber.equals(other.healthCardNumber))
			return false;
		if (medicalCondition == null) {
			if (other.medicalCondition != null)
				return false;
		} else if (!medicalCondition.equals(other.medicalCondition))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
