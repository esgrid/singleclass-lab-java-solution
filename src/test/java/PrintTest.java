import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void canReduceSheetsLeft(){
        printer.print(5, 2);
        assertEquals(90, printer.getSheetsLeft());
    }

    @Test
    public void canReduceTonerVolume(){
        printer.print(5, 2);
        assertEquals(40, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.checkIfCanPrint(15, 3));
    }

    @Test
    public void canNotPrint(){
        assertEquals(false, printer.checkIfCanPrint(20, 3));
    }
}
