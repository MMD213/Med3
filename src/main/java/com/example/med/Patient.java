package com.example.med;

import javafx.collections.ObservableArray;

import java.util.Date;

public class Patient {
    int IdPatient;
    String InsurancePolicyNumber, MedicalBookNumber,FIO,PlaceOfResidence;
    Date  DateOfBirth;

    public Patient(int idPatient, String insurancePolicyNumber, String medicalBookNumber, String FIO, String placeOfResidence, Date dateOfBirth) {
        this.IdPatient = idPatient;
        this.InsurancePolicyNumber = insurancePolicyNumber;
        this.MedicalBookNumber = medicalBookNumber;
        this.FIO = FIO;
        this.PlaceOfResidence = placeOfResidence;
        this.DateOfBirth = dateOfBirth;
    }

    public int getIdPatient() {
        return IdPatient;
    }

    public String getInsurancePolicyNumber() {
        return InsurancePolicyNumber;
    }

    public String getMedicalBookNumber() {
        return MedicalBookNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPlaceOfResidence() {
        return PlaceOfResidence;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setIdPatient(int idPatient) {
        this.IdPatient = idPatient;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.InsurancePolicyNumber = insurancePolicyNumber;
    }

    public void setMedicalBookNumber(String medicalBookNumber) {
        this.MedicalBookNumber = medicalBookNumber;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.PlaceOfResidence = placeOfResidence;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }
}
