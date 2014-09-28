package ca.hhyxe14.dao;

import org.appfuse.dao.GenericDao;

import ca.hhyxe14.model.Patient;


public interface PatientDao extends GenericDao<Patient, Long>{
	
//	public void saveOrUpdatePatient(Patient patient);

	public Patient getPatient(Long patientId);

//	public void deletePatient(Long patientId);
	
//	public List<Patient> listPatient();
	
//	public List<Patient> searchPatient(String street, String city, String postCode);

//	public List<String> getAllPatients();

}
