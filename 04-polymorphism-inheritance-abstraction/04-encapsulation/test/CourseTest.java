import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CourseTest {

  private static final String SUBJECT = "Java";
  private static final LocalDate DATE = LocalDate.now();

  @Test
  @DisplayName("constructor should set subject and start date")
  public void testUniversityCourseConstructor1() {
    Course course = new Course(SUBJECT, DATE);
    Assertions.assertEquals(SUBJECT, course.getSubject());
    Assertions.assertEquals(DATE, course.getStartDate());
  }

  @Test
  @DisplayName("constructor should not accept null subject")
  public void testUniversityCourseConstructor2() {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> new Course(null, DATE)
    );
  }


  @Test
  @DisplayName("constructor should not accept empty subject")
  public void testUniversityCourseConstructor3() {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> new Course("", DATE)
    );
  }

  @Test
  @DisplayName("constructor should not accept start date in the past")
  public void testUniversityCourseConstructor4() {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> new Course(SUBJECT, DATE.minusDays(1))
    );
  }

  @Test
  @DisplayName("should set start date - today")
  public void testUniversityCourseSetter1() {
    Course course = new Course(SUBJECT, null);

    course.setStartDate(DATE);

    Assertions.assertEquals(SUBJECT, course.getSubject());
    Assertions.assertEquals(DATE, course.getStartDate());
  }

  @Test
  @DisplayName("should not set start date - yesterday")
  public void testUniversityCourseSetter3() {
    Course course = new Course(SUBJECT, null);
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> course.setStartDate(DATE.now().minusDays(1))
    );
  }

  @Test
  @DisplayName("subject should be private")
  public void testUniversityCourseSubjectAccess() {
    Course course = new Course(SUBJECT, DATE);
    try {
      var field = course.getClass().getDeclaredField("subject");
      Assertions.assertFalse(field.canAccess(course));
    } catch (NoSuchFieldException e) {
      Assertions.fail("no subject field found");
    }
  }

  @Test
  @DisplayName("start date should be private")
  public void testUniversityCourseStartDateAccess() {
    Course course = new Course(SUBJECT, DATE);
    try {
      var field = course.getClass().getDeclaredField("startDate");
      Assertions.assertFalse(field.canAccess(course));
    } catch (NoSuchFieldException e) {
      Assertions.fail("no startDate field found");
    }
  }

}
