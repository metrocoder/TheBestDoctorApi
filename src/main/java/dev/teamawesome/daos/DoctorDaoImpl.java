package dev.teamawesome.daos;

import java.util.ArrayList;

import java.util.List;



import dev.teamawesome.entities.Doctor;

public class DoctorDaoImpl implements DoctorDAO {


	private static List<Doctor> doctors= new ArrayList<>();
	
	private static Integer count=1;
	
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

		return doctors.get(id - 1);
	}

	@Override
	public List<Doctor> getAllDoctors() {

		return doctors;

		// TODO Auto-generated method stub
		//return null;

	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		Doctor doctorUpdateMe = doctors.get(doctor.getId() -1 );
		doctorUpdateMe.setHospital(doctor.getHospital());
		doctorUpdateMe.setName(doctor.getName());
		return doctorUpdateMe;
	}

	@Override
	public boolean deleteDoctor(Doctor doctor) {
		doctors.remove(doctor.getId() -1 );
		return true;
	}

}
