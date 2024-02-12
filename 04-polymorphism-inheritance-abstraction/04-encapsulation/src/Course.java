import java.time.LocalDate;

public class Course {

    private final String subject;
    private LocalDate startDate;

    public Course(String subject, LocalDate startDate) {
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject cannot be null or empty");
        }

        if (startDate != null && startDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Course cannot start in the past");
        }

        this.subject = subject;
        this.startDate = startDate;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        if (startDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Course cannot start in the past");
        } else {
            this.startDate = startDate;
        }
    }
}
