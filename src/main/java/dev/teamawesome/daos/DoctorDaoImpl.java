package dev.teamawesome.daos;

import java.util.HashMap;
import java.util.Map;

import dev.teamawesome.entities.Doctor;

public class DoctorDaoImpl implements DoctorDAO {

	Map<Integer, Doctor> doctors= new HashMap<>();
	
	
	@Override
	public Doctor createDoctor(Doctor doctor) {

		
		return null;
	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return false;
	}

}
