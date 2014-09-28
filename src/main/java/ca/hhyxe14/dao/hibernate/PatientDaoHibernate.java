package ca.hhyxe14.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.appfuse.model.Role;
import org.appfuse.model.User;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ca.hhyxe14.dao.PatientDao;
import ca.hhyxe14.model.Patient;

@Repository("patientDao")
public class PatientDaoHibernate extends GenericDaoHibernate<Patient, Long> implements PatientDao {

    /**
     * Constructor to create a Generics-based version using Role as the entity
     */
    public PatientDaoHibernate() {
        super(Patient.class);
    }

    /**
     * {@inheritDoc}
     */
    public Patient getPatient(Long patientId) {
        List roles = getSession().createCriteria(Patient.class).add(Restrictions.eq("patientId", patientId)).list();
        if (roles.isEmpty()) {
            return null;
        } else {
            return (Patient) roles.get(0);
        }
    }

	public void remove(User arg0) {
		
	}

	public User save(User arg0) {
		return null;
	}

}
