package com.khdreamlife.khlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khdreamlife.khlab.model.PatientInfo;
import com.khdreamlife.khlab.repository.PatientInfoRepisotory;

@Service
public class PatientInfoServiceImpl implements PatientInfoService{
	
	@Autowired
	private PatientInfoRepisotory repo;

	@Override
	public PatientInfo getPatientData(String barcode) {
		PatientInfo patientInfo = repo.findByBarcode(barcode);
		return patientInfo;
	}

	@Override
	public PatientInfo savePatientInfo(PatientInfo patientInfo) {
		return repo.insert(patientInfo);
		
	}

	@Override
	public void printBarcode(PatientInfo patientInfo) {
		//access the folder where specific patient barcode is present
		
		// print the barcode as many times as the lab technician has mentioned
		
		
	}

	@Override
	public PatientInfo editPatientInfo(PatientInfo patientInfo) {
		return repo.save(patientInfo);
		
	}

	@Override
	public void removePatientInfo(String barcode) {
		repo.deleteByBarcode(barcode);
	}

	@Override
	public List<PatientInfo> getAllPatientInfos() {
		return repo.findAll();
	}
	

}
