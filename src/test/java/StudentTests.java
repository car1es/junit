import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentTests {

    private Student st1,st2,st3;

    @BeforeEach
    public void setup() {
        st1 = new Student("Aleksey", 37, 8.5, Sex.MALE);
        st2 = new Student("Elizaveta", 31, 9.3, Sex.FEMALE);
        st3 = new Student("Petr", 25, 6.3, Sex.MALE);
    }

    @AfterEach
    public void teardown() {
        st1 = null;
        st2 = null;
        st3 = null;
    }

    @Test
    public void getAllStudentsTests() {
        // given:
        List<Student> expected = new ArrayList<>();
        expected.add(st1);
        expected.add(st2);
        expected.add(st3);

        //when:
        List<Student> actual = Student.getAllStudents();

        //then:
        assertEquals(expected, actual);
    }
    @Test
    public void getAllStudentsTest_NO_NULL() {
        List<Student> expected = Student.getAllStudents();
        assertNotNull(expected);
    }
    @Test
    public void getByGenderStudentsTests(){
        // given:
        List<Student> expected = new ArrayList<>();
        expected.add(st1);
        expected.add(st3);

        //when:
        List<Student> actual = Student.getByGenderStudents(Sex.MALE);

        //then:
        assertEquals(expected, actual);
    }
    @Test
    public void getByGenderStudentsTests_NO_NULL() {
        List<Student> expected = Student.getByGenderStudents(Sex.MALE);
        assertNotNull(expected);
    }
    @Test
    public void getStudentUnderAgeTests(){
        // given:
        List<Student> expected = new ArrayList<>();
        expected.add(st3);

        //when:
        List<Student> actual = Student.getStudentUnderAge(30);

        //then:
        assertEquals(expected, actual);
    }
    @Test
    public void getStudentUnderAverageRating(){
        // given:
        List<Student> expected = new ArrayList<>();
        expected.add(st3);

        //when:
        List<Student> actual = Student.getStudentUnderAverageRating(7.9);

        //then:
        assertEquals(expected, actual);
    }

    //Hamcrets

    @Test
    public void getAllStudentsTestsHamcrets() {
        // given:
        List<Student> expected = new ArrayList<>();
        expected.add(st1);
        expected.add(st2);
        expected.add(st3);

        //when:
        List<Student> actual = Student.getAllStudents();

        //then:
        assertThat(expected,equalTo(actual));
    }
    @Test
    public void getAllStudentsTestHamcretsNoNULL() {
        List<Student> expected = Student.getAllStudents();
        assertThat(expected, notNullValue());
    }
}
