import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import com.spring.codex.model.Mensaje;

public class MensajeJUNIT {

	public static Mensaje m;
	public static String emisor="Usuario1";
	public static String Receptor="Usuario2";
	public static String texto="abcd";
	public static long ID=5;
	
	@BeforeClass
	public static void CrearMensaje(){
		m=new Mensaje();
		m.setEmisor(emisor);
		m.setReceptor(Receptor);
		m.settexto(texto);
	}
	
	@Test
	public void test() {
		assertEquals("Comprobando el emisor",emisor,m.getEmisor());
		assertEquals("Comprobando el receptor",Receptor,m.getReceptor());
		assertEquals("Comprobando el texto",texto,m.gettexto());
;

	}

}
