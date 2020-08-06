package dev.teamawesome.daos;

import java.util.ArrayList;
import java.util.List;

import dev.teamawesome.entities.Doctor;

public class DoctorDaoImpl implements DoctorDAO {

	private static List<Doctor> doctors= new ArrayList<>();
	
	private static Integer count=0;
	
	private static DoctorDaoImpl dao;
	
	private DoctorDaoImpl () {}
	
	
	public static DoctorDaoImpl getInstance(){
		if (dao==null)
			dao = new DoctorDaoImpl();
		return dao;
	}
	
	
	@Override
	public Doctor createDoctor(Doctor doctor) {

		doctor.setId(count);

		doctors.add(doctor);
		count++;
		
		return doctor;
	}
	
	
	
	

	@Override
	public Doctor getDoctorById(int id) {

		return doctors.get(id);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctors;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		doctors.set(doctor.getId(), doctor);
		return doctor;
	}

	@Override
	public boolean deleteDoctor(Doctor doctor) {
		doctors.remove(doctor.getId());
		return false;
	}

}
