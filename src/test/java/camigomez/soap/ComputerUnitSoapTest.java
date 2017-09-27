package camigomez.soap;

import static org.junit.Assert.*;

import org.junit.Test;

import net.webservicex.ComputerUnit;
import net.webservicex.ComputerUnitSoap;
import net.webservicex.Computers;

public class ComputerUnitSoapTest {

	@Test
	public void testChangeComputerUnit() {
		ComputerUnitSoap servicio = new ComputerUnit().getComputerUnitSoap();
		double valor = servicio.changeComputerUnit(2.0, Computers.MEGABYTE, Computers.KILOBYTE);
		System.out.println("Resultado: " + valor);
		assertTrue(valor == 2048);
	}

}
