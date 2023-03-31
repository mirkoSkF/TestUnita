package labtest1.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testToString() {
		Persona p = new Persona();
		String nome="Marco";
		String cognome="Verdi";
		int eta=37;
		p.setNome(nome);
		p.setCognome(cognome);
		p.setEta(eta);
		//assertEquals(messaggio test fallito, aspettativa, risultato ritornato)
		//Il test darà colore verde se l'aspettativa ed il risultato coincidono,
		//altrimenti il colore sarà rosso (Failures)
		//NB:in caso di errori (Errors) non previsti, il test darà sempre colore rosso
		assertEquals("La stringa ritornata NON è quella attesa!",
				nome+","+cognome+","+eta, //è il risultato atteso
				p.toString()); //è il risultato effettivo
		
		assertNotEquals("La stringa ritornata NON è quella attesa!",
				nome+","+cognome+","+eta, //confronto ancora stringhe uguali e quindi non supero il test di disugliaglianza
				p.toString());
	}
	
	@Test
	void testHashCode() {
		Persona p1 = new Persona("Marco","Rossi",37);
		Persona p2 = new Persona("Mirko","Verdi",45);
		Persona p3 = new Persona("Marco","Rossi",37);
		Persona p4 = p1;
		assertEquals("Il risultato del confronto NON è quello atteso!",
				false, p1.hashCode()==p2.hashCode());
		assertNotEquals("Il risultato del confronto NON è quello atteso!",
				true, p1.hashCode()==p2.hashCode());
		assertEquals("Il risultato del confronto NON è quello atteso!",
				true, p1.hashCode()==p3.hashCode());
		assertNotEquals("Il risultato del confronto NON è quello atteso!",
				false, p1.hashCode()==p3.hashCode());
		//assertSame() verifica se hanno ugual riferimento
		assertSame("Errore! Gli oggetti hanno diverso riferimento!",p1,p4);
		assertNotSame("Errore! Gli oggetti hanno diverso riferimento!",p1,p3);
	}
	
	@Test
	void testEquals() {
		Persona p1 = new Persona("Marco","Rossi",37);
		Persona p2 = new Persona("Mirko","Verdi",45);
		Persona p3 = new Persona("Marco","Rossi",37);
		assertEquals("Il risultato del confronto NON è quello atteso!",
				false, p1.equals(p2));
		assertEquals("Il risultato del confronto NON è quello atteso!",
				true, p1.equals(p3));
		assertNotSame("Errore! Gli oggetti hanno diverso riferimento!",p1,p3);
	}
	
	@Test
	void testCostruttoreParam() {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci l'età:");
		//La riga successiva è suscettibile ad errore (Errors) in quanto
		//può manifestarsi un eccezione in corrispondenza del metodo nextInt()
		Persona p1 = new Persona("Marco","Rossi",input.nextInt());
		assertEquals("Il risultato del confronto NON è quello atteso!",
				p1.getNome()+","+
				p1.getCognome()+","+
				p1.getEta(), p1.toString());
		input.close();
	}

}
