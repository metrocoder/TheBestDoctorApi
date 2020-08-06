package dev.teamawesome.services;

import java.util.List;

import dev.teamawesome.entities.Doctor;

public interface DoctorService
{
	Doctor createDoctor(Doctor doctor);

	List<Doctor> getAllDoctors();
	
	Doctor updateDoctor(Doctor doctor);
	
	Doctor getDoctorById(int id);

	boolean deleteDoctor(Doctor doctor);
}
