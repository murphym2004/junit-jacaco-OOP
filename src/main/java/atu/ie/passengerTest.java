package atu.ie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class passengerTest {

    @Test
    public void testValidPassengerCreation() {
        Passenger p = new Passenger("Mr", "John", "Smith");
        assertEquals("Mr", p.getTitle());
        assertEquals("John", p.getFirstname());
        assertEquals("Smith", p.getLastname());
    }
    @Test
    public void testInvalidPassengerCreation() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("or", "John", "Smith");
        });
        assertEquals("Invalid title: must be Mr, Mrs or Ms", e.getMessage());
    }
    @Test
    public void TestFirstnameExepction() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Jo", "Smith");
        });
        assertEquals("Invalid first name: must be at least 3 characters", e.getMessage());

    }
    @Test
    public void testShortLastNameThrowsException() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Ms", "Jane", "Li");
        });
        assertEquals("Invalid last name: must be at least 3 characters", e.getMessage());
    }
    @Test
    public void testNullFirstNameThrowsException() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", null, "Smith");
        });
        assertEquals("Invalid first name: must be at least 3 characters", e.getMessage());
    }
    @Test
    public void testNullLastNameThrowsException() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", "john", null);
        });
        assertEquals("Invalid last name: must be at least 3 characters", e.getMessage());
    }
}
