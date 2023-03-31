package labtest1.model;

public class TestClassRoom {
	
	//Questo metodo verrà testato con gli asserts: assertNull() e assertNotNull()
		public Object getOggetto(String scelta) {
			if(scelta.equalsIgnoreCase("si"))
				return new Object();
			else
				return null;
		}
		
		//Questo metodo verrà testato con gli asserts: assertTrue() e assertFalse()
		public Boolean getBool(String scelta) {
			if(scelta.equalsIgnoreCase("si"))
				return true;
			else
				return false;
		}

}
