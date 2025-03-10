package fr.ensai.library;

import java.util.Date;

public class Loan {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private Student student;
    private Item item;
    private Date startDate;
    private Date returnDate;

    /**
     * Constructs a new Student object with the given name and age.
     * @param name The name of the student.
     * @param age The age of the student.
     */
    public Loan(Student student, Item item, Date starDate) {
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null;
    }

    public void setReturnDate(Date newDate){
        // il faudrait faire une exception, et il faudrait qu'on ait un heritage entre personnes et author/student, et changer loan
        this.returnDate = newDate;

    }

}
