package ca.hhyxe14.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import ca.hhyxe14.model.Patient;


public interface PatientManager extends GenericManager<Patient, Long> {
    /**
     * {@inheritDoc}
     */
    List getPatients(Patient patient);

    /**
     * {@inheritDoc}
     */
    Patient getPatient(Long patientId);

    /**
     * {@inheritDoc}
     */
    Patient savePatient(Patient patient);

    /**
     * {@inheritDoc}
     */
    void removePatient(Long patientId);
}
