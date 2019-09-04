package com.khdreamlife.khlab.service;

import java.util.List;

import com.khdreamlife.khlab.model.PatientInfo;

public interface PatientInfoService {
	
	PatientInfo getPatientData(String barcode);
	
	PatientInfo savePatientInfo(PatientInfo patientInfo);
	
	void printBarcode(PatientInfo patientInfo);
	
	PatientInfo editPatientInfo(PatientInfo patientInfo);
	
	void removePatientInfo(String barcode);
	
	List<PatientInfo> getAllPatientInfos();
	
}
