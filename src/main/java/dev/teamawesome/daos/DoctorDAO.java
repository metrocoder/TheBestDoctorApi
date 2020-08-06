package dev.teamawesome.daos;

import java.util.Set;

import dev.teamawesome.entities.Doctor;

public interface  DoctorDAO
{
//    CRUD OPS

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctorById(int id);
    Set<Doctor> getAllDoctors();

    Doctor updateDoctor(Doctor doctor);

    boolean deleteDoctor(Doctor doctor);

}
