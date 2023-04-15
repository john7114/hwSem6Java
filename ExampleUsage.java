public class ExampleUsage {
    public static void main(String[] args) {

        Employee employee1 = new Employee(5, 44, "Pavel", "Frolov");
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2. id = 777;
        employee2.age = 77;
        employee2.name = "Vasiliy";
        employee2.surname = "Ivanov";
        System.out.println(employee2);

        if (employee1.equals(employee2)) {
            System.out.println("Работники равны, так как равны их заработные платы");
        }

        System.out.printf("Hash: %d", employee1.hashCode());
        System.out.printf("Hash: %d", employee2.hashCode());

        System.out.println(employee1.getFullName());

        System.out.println(employee2.olderThan(employee1));

        employee2.upgrade(354.33);
        System.out.println(employee2);

    }
}
