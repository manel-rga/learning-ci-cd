package com.greglturnquist.payroll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    final String validFirstName = "Tony";
    final String validLastName = "Zé";
    final String validDescription = "Escaca bem a pedra";
    final String validJobTitle = "Pedreiro";
    final String validEmail = "tonyze@latinlover.pt";

    @DisplayName("First name is valid")
    @Test
    void shouldBeTrueForValidFirstName() {

        Employee employee = new Employee(validFirstName, validLastName, validDescription, validJobTitle, validEmail);
        String expected = validFirstName;

        String result = employee.getFirstName();

        assertEquals(expected, result);
    }

    @DisplayName("Last name is valid")
    @Test
    void shouldBeTrueForValidLastName() {

        Employee employee = new Employee(validFirstName, validLastName, validDescription, validJobTitle, validEmail);
        String expected = validLastName;

        String result = employee.getLastName();

        assertEquals(expected, result);
    }

    @DisplayName("Description is valid")
    @Test
    void shouldBeTrueForValidDescription() {

        Employee employee = new Employee(validFirstName, validLastName, validDescription, validJobTitle, validEmail);
        String expected = validDescription;

        String result = employee.getDescription();

        assertEquals(expected, result);
    }

    @DisplayName("Job Title is valid")
    @Test
    void shouldBeTrueForValidJobTitle() {

        Employee employee = new Employee(validFirstName, validLastName, validDescription, validJobTitle, validEmail);
        String expected = validJobTitle;

        String result = employee.getJobTitle();

        assertEquals(expected, result);
    }

    @DisplayName("Email is valid")
    @Test
    void shouldBeTrueForValidEmail() {

        Employee employee = new Employee(validFirstName, validLastName, validDescription, validJobTitle, validEmail);
        String expected = validEmail;

        String result = employee.getEmail();

        assertEquals(expected, result);
    }

    @DisplayName("First name is null")
    @Test
    void shouldThrowNullFirstName() {
        String nullFirstName = null;

        assertThrows(IllegalArgumentException.class, () -> new Employee(nullFirstName, validLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("First name is empty")
    @Test
    void shouldThrowEmptyFirstName() {
        String emptyFirstName = "";

        assertThrows(IllegalArgumentException.class, () -> new Employee(emptyFirstName, validLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("First name is Blank")
    @ParameterizedTest
    @ValueSource(strings = {" ", "   "})
    void shouldThrowBlankFirstName(String blankFirstName) {
        assertThrows(IllegalArgumentException.class, () -> new Employee(blankFirstName, validLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("Last name is null")
    @Test
    void shouldThrowNullLastName() {
        String nullLastName = null;

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, nullLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("Last name is empty")
    @Test
    void shouldThrowEmptyLastName() {
        String emptyLastName = "";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, emptyLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("Last name is blank")
    @ParameterizedTest
    @ValueSource(strings = {" ", "   "})
    void shouldThrowBlankLastName(String blankLastName) {
        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, blankLastName, validDescription, validJobTitle, validEmail));
    }

    @DisplayName("Description is null")
    @Test
    void shouldThrowNullDescription() {
        String nullDescription = null;

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, nullDescription, validJobTitle, validEmail));
    }

    @DisplayName("Description is empty")
    @Test
    void shouldThrowEmptyDescription() {
        String emptyDescription = "";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, emptyDescription, validJobTitle, validEmail));
    }

    @DisplayName("Description is blank")
    @ParameterizedTest
    @ValueSource(strings = {" ", "   "})
    void shouldThrowBlankDescription(String blankDescription) {
        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, blankDescription, validJobTitle, validEmail));
    }

    @DisplayName("Job Title is null")
    @Test
    void shouldThrowNullJobTitle() {
        String nullJobTitle = null;

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, nullJobTitle, validEmail));
    }

    @DisplayName("Job Title is empty")
    @Test
    void shouldThrowEmptyJobTitle() {
        String emptyJobTitle = "";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, emptyJobTitle, validEmail));
    }

    @DisplayName("Job Title is blank")
    @ParameterizedTest
    @ValueSource(strings = {" ", "   "})
    void shouldThrowBlankJobTitle(String blankJobTitle) {
        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, blankJobTitle, validEmail));
    }

    @DisplayName("Email is null")
    @Test
    void shouldThrowNullEmail() {
        String nullEmail = null;

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, validJobTitle, nullEmail));
    }

    @DisplayName("Email is empty")
    @Test
    void shouldThrowEmptyEmail() {
        String emptyEmail = "";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, validJobTitle, emptyEmail));
    }

    @DisplayName("Email is blank")
    @ParameterizedTest
    @ValueSource(strings = {" ", "   "})
    void shouldThrowBlankEmail(String blankEmail) {
        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, validJobTitle, blankEmail));
    }

    @DisplayName("Email input doens't have @ symbol")
    @Test
    void shouldThrowNoAtSymbolInEmail() {
        String noAtSymbolEmail = "tonyzegmail.com";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, validJobTitle, noAtSymbolEmail));
    }

    @DisplayName("Email input doens't have dot symbol")
    @Test
    void shouldThrowNoDotSymbolInEmail() {
        String noDotSymbolEmail = "tonyze@gmailcom";

        assertThrows(IllegalArgumentException.class, () -> new Employee(validFirstName, validLastName, validDescription, validJobTitle, noDotSymbolEmail));
    }

}