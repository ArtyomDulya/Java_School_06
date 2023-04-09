package Homeworks.Homework_8_2;

public class Main {
    public static void main(String[] args) {
        Employee alexandr = new Employee();
        alexandr.setName("Alexandr");
        alexandr.setBaseSalary(100);
        Employee timur = new Employee();
        timur.setName("Timur");
        timur.setBaseSalary(150);
        Employee trofim = new Employee();
        trofim.setName("Trofim");
        trofim.setBaseSalary(200);
        Employee[]employees = {alexandr, timur, trofim};
        Utils utils = new Utils();
//        System.out.println(utils.findByName("Alexandr", employees));
//        System.out.println(utils.findByStringName("dr", employees));
//        System.out.println(utils.sumSalary(employees));
//        System.out.println(utils.minSalary(employees));
//        System.out.println(utils.maxSalary(employees));

        Manager boris = new Manager();
        boris.setName("Boris");
        boris.setBaseSalary(50);
        boris.setNumberOfSubordinates(5);
        Manager alexey = new Manager();
        alexey.setName("Alexey");
        alexey.setBaseSalary(150);
        alexey.setNumberOfSubordinates(10);
        Manager fedor = new Manager();
        fedor.setName("Fedor");
        fedor.setBaseSalary(200);
        fedor.setNumberOfSubordinates(15);
        Manager[]managers = {boris, alexey, fedor};
        System.out.println(fedor.getSalary());
        System.out.println(utils.minManager(managers));
        System.out.println(utils.maxManager(managers));
        System.out.println(utils.maxManagerBonus(managers));
        System.out.println(utils.minManagerBonus(managers));


    }
}
