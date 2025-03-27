public class Employee extends OrganizationComponent {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXml(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        return indent + "<employee name=\"" + name + "\" salary=\"" + salary + "\" />";
    }
}
