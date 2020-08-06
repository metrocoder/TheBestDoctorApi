package dev.teamawesome.servicetests;

import dev.teamawesome.entities.Doctor;
import dev.teamawesome.services.DoctorService;
import dev.teamawesome.services.DoctorServiceImpl;
import org.junit.jupiter.api.*;

import javax.print.Doc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DoctorServiceTest
{
    private static DoctorService dserv = new DoctorServiceImpl();
    @Test
    @Order(1)
    void createDoctor()
    {
        Doctor doctor = new Doctor(0, "Dr. Mario RX", "Live Forever Hospital");
        Doctor result = dserv.createDoctor(doctor);

        Assertions.assertNotEquals(0, result.getId());
    }

    @Test
    @Order(2)
    void getAllDoctors()
    {
        List<Doctor> doctors = dserv.getAllDoctors();
        Assertions.assertNotEquals(0, doctors.size());
    }

    @Test
    @Order(3)
    void getDoctorById()
    {
        Doctor doctor = dserv.getDoctorById(1);
        Assertions.assertEquals("Dr. Mario RX", doctor.getName());
    }

    @Test
    @Order(4)
    void updateDoctor()
    {
        Doctor doctor = dserv.getDoctorById(1);
        doctor.setHospital("Free Euthenastia clinic");
        Doctor reesult = dserv.updateDoctor(doctor);

        Assertions.assertEquals("Free Euthenastia clinic", reesult.getHospital());
    }

    @Test
    @Order(5)
    void deleteDoctor()
    {
        Doctor doctor = dserv.getDoctorById(1);
        boolean reesult = dserv.deleteDoctor(doctor);

        Assertions.assertEquals(true, reesult);
    }




}