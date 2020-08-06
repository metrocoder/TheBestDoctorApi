package dev.teamawesome.daos;

import dev.teamawesome.entities.Doctor;

public interface  DoctorDAO
{
//    CRUD OPS

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctorById(int id);
    Doctor getAllDoctors();

    Doctor updateDoctor(Doctor doctor);

    boolean deleteDoctor(Doctor doctor);

}
