package ru.courses.company;

import java.util.Objects;

public class Employee {
    private String name;
    private Department department;

    Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (Objects.equals(getName(), department.getBoss().getName())){
            return getName() + " начальник отдела " + department.getNameDepartament();
        }
        return String.format("%s работает в отделе %s, начальник которого %s",
                getName(),
                department.getNameDepartament(),
                department.getBoss().getName());
    }
}
