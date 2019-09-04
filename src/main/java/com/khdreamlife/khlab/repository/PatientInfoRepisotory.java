package com.khdreamlife.khlab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.khdreamlife.khlab.model.PatientInfo;

public interface PatientInfoRepisotory extends MongoRepository<PatientInfo, String> {
	
	PatientInfo findByBarcode(String barcode);
	void deleteByBarcode(String barcode);

}
