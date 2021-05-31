package enums;

public class Employee {

    private final String name;
    private final Gender gender;
    private final Department department;

    public Employee(final String name, final Gender gender, final Department department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Department getDepartment() {
        return department;
    }
}
