package daos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dev.teamawesome.daos.DoctorDAO;
import dev.teamawesome.daos.DoctorDaoImpl;
import dev.teamawesome.entities.Doctor;


@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
class TestDaos {

	
	private DoctorDAO dao = DoctorDaoImpl.getInstance();
	
	@Test
	@Order(1)
	void testCreateDoctor() {
		Doctor doc = new Doctor(-1, "john", "hos1");	//id should be zero
		
		Assertions.assertNotEquals(-1, dao.createDoctor(doc).getId());
		
		Doctor doc2= new Doctor(0,"brian", "hos2");  //id should be one
		
		dao.createDoctor(doc2);

	}

	@Test @Order(2)
	void testGetDoctorById() {
		Assertions.assertEquals(1, dao.getDoctorById(1).getId());
		
	}

	@Test 
	@Order(3)
	void testGetAllDoctors() {
		Assertions.assertEquals(2, dao.getAllDoctors().size());
	}

	@Test
	@Order(4)
	void testUpdateDoctor() {
		Doctor doc= new Doctor(1, "BOJO", "ENG");
		Assertions.assertEquals("BOJO", dao.updateDoctor(doc).getName());
	}

	@Test
	@Order(5)
	void testDeleteDoctor() {
		Assertions.assertFalse(dao.deleteDoctor(new Doctor(1,"s", "k")));
	}

}
