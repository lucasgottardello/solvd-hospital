package com.lucas.solvd.homework2.building.hospital;

import com.lucas.solvd.homework2.building.Building;
import com.lucas.solvd.homework2.human.doctor.Doctor;
import com.lucas.solvd.homework2.human.patient.Patient;

import java.util.ArrayList;

public class Hospital extends Building implements HospitalInterface {

    public Hospital() {
        super("");
    }


    public Hospital(String hospitalName) {
        super(hospitalName);
    }

    public static ArrayList<Doctor> doctorsList = new ArrayList<Doctor>();
    public static ArrayList<Patient> patientsList = new ArrayList<Patient>();
    public static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();


    public void registerPatient(Patient patient) {
        patientsList.add(patient);
    }

    public void registerDoctor(Doctor doctor) {
        doctorsList.add(doctor);
    }

    public void registerAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }


}
