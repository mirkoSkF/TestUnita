package labtest1.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


class TestClassTest {

	@Test
	void testGetOggetto() {
		TestClassRoom tcr = new TestClassRoom();
		//assertNull(): verifica se l'oggetto passato come secondo argomento è nullo
		assertNull("Oggetto NON nullo!", tcr.getOggetto("no")); 
		//assertNotNull(): verifica se l'oggetto passato come secondo argomento non è nullo
		assertNotNull("Oggetto nullo!", tcr.getOggetto("si"));
	}
	
	@Test
	void testGetBool() {
		TestClassRoom tcr = new TestClassRoom();
		//assertNull(): verifica se l'oggetto passato come secondo argomento è nullo
		assertTrue("Non è true!", tcr.getBool("si")); 
		//assertNotNull(): verifica se l'oggetto passato come secondo argomento non è nullo
		assertFalse("Non è false!", tcr.getBool("no"));
	}

}
