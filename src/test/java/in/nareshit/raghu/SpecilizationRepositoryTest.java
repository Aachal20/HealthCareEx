package in.nareshit.raghu;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import in.nareshit.raghu.entity.Specilization;
import in.nareshit.raghu.repo.SpecializationRepository;

@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(true)
public class SpecilizationRepositoryTest {

	@Autowired
	private SpecializationRepository repo;

	/**
	 * 1. Test Save Repo
	 */

	
	
	/*
	 * @Disabled
	 * 
	 * @Test
	 * 
	 * @Order(1) public void testSpecCreate() { Specilization spec = new
	 * Specilization(null, "CRDLS", "Cardiologists",
	 * "hey’re experts on the heart and blood vessels"); spec = repo.save(spec);
	 * assertNotNull(spec.getId(),"Spec is not created"); }
	 */


	/**
	 * 1. Test display all operation
	 */
	@Test
	@Order(2)
	public void testSpecFetchAll() {

		List<Specilization> list = repo.findAll();
		assertNotNull(list);
		if(list.size()>0) {
			fail("no data exist in db");
		}

	}
}
