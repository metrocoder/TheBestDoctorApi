package dev.teamawesome.services;

import java.util.List;

import dev.teamawesome.daos.DoctorDAO;
import dev.teamawesome.daos.DoctorDaoImpl;
import dev.teamawesome.entities.Doctor;

public class DoctorServiceImpl implements DoctorService {
	
	public DoctorDAO ddao = DoctorDaoImpl.getInstance();
	public Doctor createDoctor(Doctor doctor) {
		return this.ddao.createDoctor(doctor);
	
	}

	public List<Doctor> getAllDoctors() {
		return this.ddao.getAllDoctors();
	
	}
	
	public Doctor updateDoctor(Doctor doctor) {
		return this.ddao.updateDoctor(doctor);
	
	}
	
	public Doctor getDoctorsById(int id) {
		return this.ddao.getDoctorById(id);

	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return this.ddao.getDoctorById(id);
	
	}

	@Override
	public boolean deleteDoctor(Doctor doctor)
	{
		return this.ddao.deleteDoctor(doctor);
	}
}
