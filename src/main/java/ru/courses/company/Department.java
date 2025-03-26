package ru.courses.company;

public class Department {
    private String nameDepartament;
    private Employee boss;

    String getNameDepartament() {
        return nameDepartament;
    }

    Employee getBoss() {
        return boss;
    }

    Department(String nameDepartament, String nameBoss){
        this.nameDepartament = nameDepartament;
        this.boss = new Employee(nameBoss, this);
    }

}
