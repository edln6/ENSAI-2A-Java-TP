package fr.ensai.library;

public class Student {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student object with the given name and age.
     * @param name The name of the student.
     * @param age The age of the student.
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

}
