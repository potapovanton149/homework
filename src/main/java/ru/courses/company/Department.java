package ru.courses.company;

public class Department {
    private String nameDepartament;
    private Employee boss;

    public String getNameDepartament() {
        return nameDepartament;
    }

    public Employee getBoss() {
        return boss;
    }

    public Department(String nameDepartament, String nameBoss){
        this.nameDepartament = nameDepartament;
        this.boss = new Employee(nameBoss, this);
    }

}
