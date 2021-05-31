package enums;

import java.util.Optional;

public class EnumClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Stefana", Gender.F, Department.MANUFACTURING);
        final String code = Optional.of(employee)
                .map(e -> e.getDepartment())
                .map(d -> d.getCode())
                .orElse("Nu am gasit codul:(");
        System.out.println(code);

        Employee employee2 = new Employee("Stefana", Gender.F, null);
        Optional.of(employee2)
                .map(Employee::getDepartment)
                .map(Department::getCode)
                .ifPresentOrElse(c -> System.out.println(c + ":)"),
                        () -> System.out.println("Nu am gasit codul :("));

        final String name = Optional.of(employee)
                .filter(e -> Department.MANUFACTURING.equals(e.getDepartment()))
                .filter(e -> Gender.F.equals(e.getGender()))
                .map(Employee::getName)
                .orElse("No name :(");
        System.out.println(name);
    }
}
