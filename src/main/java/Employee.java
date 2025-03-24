import java.util.Objects;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
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
