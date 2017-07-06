package com.example.nouredine.hospitalrdv;

public class Rdv {

    private int id;
    private String dateRdv, heureRDV, medecin, patient;

    public Rdv() {
        this.id = 0;
        this.dateRdv = "";
        this.heureRDV = "";
        this.medecin = "";
        this.patient = "";
    }

    public Rdv(int id, String drdv, String hrdv, String med, String pat) {
        this.id = id;
        this.dateRdv = drdv;
        this.heureRDV = hrdv;
        this.medecin = med;
        this.patient =pat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }

    public String getHeureRDV() {
        return heureRDV;
    }

    public void setHeureRDV(String heureRDV) {
        this.heureRDV = heureRDV;
    }

    public String getMedecin() {
        return medecin;
    }

    public void setMedecin(String medecin) {
        this.medecin = medecin;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
}
