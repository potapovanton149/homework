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
        //вот тут доолго думал, как передать второй аргумент :)
        this.boss = new Employee(nameBoss, this);
    }

}
