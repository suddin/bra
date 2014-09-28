package ca.hhyxe14.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.hhyxe14.dao.PatientDao;
import ca.hhyxe14.model.Patient;
import ca.hhyxe14.service.PatientManager;


@Service("patientManager")
public class PatientManagerImpl extends GenericManagerImpl<Patient, Long>  implements PatientManager {
    
	private PatientDao patientDao;

    public PatientDao getPatientDao() {
		return patientDao;
	}

    @Autowired
	public void setPatientDao(PatientDao patientDao) {
		this.patientDao = patientDao;
	}

    /**
     * {@inheritDoc}
     */
    public List<Patient> getPatients(Patient patient) {
        return patientDao.getAll();
    }

    /**
     * {@inheritDoc}
     */
    public Patient getPatient(Long patientId) {
        return patientDao.getPatient(patientId);
    }

    /**
     * {@inheritDoc}
     */
    public Patient saveRole(Patient patient) {
        return patientDao.save(patient);
    }


	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePatient(Long patientId) {
		// TODO Auto-generated method stub
		
	}


}