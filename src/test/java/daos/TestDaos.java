package daos;

import org.junit.jupiter.api.*;

import dev.teamawesome.daos.DoctorDAO;
import dev.teamawesome.daos.DoctorDaoImpl;
import dev.teamawesome.entities.Doctor;


@TestMethodOrder( MethodOrderer.OrderAnnotation.class)
class TestDaos {

	
	private static DoctorDAO dao = DoctorDaoImpl.getInstance();
	
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
		Assertions.assertNotEquals(false, dao.deleteDoctor(new Doctor(1,"s", "k")));
	}

	@AfterAll
	@Test
	 static void doSomething(){
		for (int i =1 ; i< dao.getAllDoctors().size() -1; i++)
		{
			dao.deleteDoctor(dao.getDoctorById(i));
		}

	}
}
