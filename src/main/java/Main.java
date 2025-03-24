import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Сразу создаем два департамента с двумя руководителями. При таком подходе мы выполняем условие:
        //"Необходимо гарантировать, что Начальник отдела всегда работает в том отделе, где он начальник."

        Department departmentQA = new Department("DepartmentQA", "Влад");
        System.out.println(departmentQA.getBoss());
        Department departmentRun = new Department("DepartmentRun", "Антон");
        System.out.println(departmentRun.getBoss());

        //Отдаем по одному сотруднику в каждый департамент:
        Employee employee1 = new Employee("Сергей", departmentQA);
        System.out.println(employee1);
        Employee employee2 = new Employee("Николай", departmentRun);
        System.out.println(employee2);
    }
}