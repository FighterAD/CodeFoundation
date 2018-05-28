import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spring.codex.model.Usuario;

public class UsuarioJUNIT {

		public static Usuario u;
		
		public static String DNI="93221234A";
		public static String nombre="Alberto";
		public static String apellido1="Perez";
		public static String apellido2="Perez";
		public static String email="AlbertoPerez@protonmail.com";
		public static String password="******";
		public static Date fecha_nacimiento=null;
		public static int codigoPostal=29000;
		public static String direccion="UMA";
		
	@BeforeClass
	public static void CrearUsuario() {
		u=new Usuario();
		u.setDNI(DNI);
		u.setNombre(nombre);
		u.setApellido1(apellido1);
		u.setApellido2(apellido2);
		u.setCodigoPostal(codigoPostal);
		u.setDireccion(direccion);
		u.setEmail(email);
		u.setPassword(password);
		u.setFecha_nacimiento(fecha_nacimiento);
	
	}
	
	@Test
	public void autor() {
		assertEquals("Comprobando el dni",DNI,u.getDNI());
		assertEquals("Comprobando el nombre",nombre,u.getNombre());
		assertEquals("Comprobando el apellido 1",apellido1,u.getApellido1());
		assertEquals("Comprobando el apellido 2",apellido2,u.getApellido2());
		assertEquals("Comprobando el codigo postal",codigoPostal,u.getCodigoPostal());
		assertEquals("Comprobando la direccion",direccion,u.getDireccion());
		assertEquals("Comprobando el email",email,u.getEmail());
		assertEquals("Comprobando la contraseña",password,u.getPassword());
		assertEquals("Comprobando fecha de nacimiento",fecha_nacimiento,u.getFecha_nacimiento());


	}

}
