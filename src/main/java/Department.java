import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        children.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        children.remove(component);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent child : children) {
            total += child.getSalary();
        }
        return total;
    }

    @Override
    public String toXml(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        StringBuilder xml = new StringBuilder();
        xml.append(indent).append("<department name=\"").append(name).append("\">\n");
        for (OrganizationComponent child : children) {
            xml.append(child.toXml(indentLevel + 1)).append("\n");
        }
        xml.append(indent).append("</department>");
        return xml.toString();
    }
}
