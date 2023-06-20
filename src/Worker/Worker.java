package Worker;

import java.util.Arrays;
import java.util.Scanner;

public class Worker {
    private String fullName;
    private String position;
    private int employmentYear;

    public Worker(String fullName, String position, int employmentYear) {
        this.fullName = fullName;
        this.position = position;
        this.employmentYear = employmentYear;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }
}

