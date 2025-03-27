public class Main {
    public static void main(String[] args) {
        Department root = new Department("Head Office");

        Department itDept = new Department("IT Department");
        itDept.add(new Employee("Alice", 90000));
        itDept.add(new Employee("Bob", 85000));

        Department hrDept = new Department("HR Department");
        hrDept.add(new Employee("Carol", 70000));

        root.add(itDept);
        root.add(hrDept);
        root.add(new Employee("CEO", 150000));

        System.out.println("Total Salary: $" + root.getSalary());
        System.out.println("\nOrganization Structure (XML):\n");
        System.out.println(root.toXml(0));
    }
}
