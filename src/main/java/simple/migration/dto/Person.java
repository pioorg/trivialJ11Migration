package simple.migration.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

//Note, that this class is bad. It's only for demo purposes.
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private String firstName;
    private String lastName;
    private List<Person> children;

    public Person(String firstName, String lastName, List<Person> children) {
        this.firstName = firstName;
        this.lastName = lastName;
        setChildren(children);
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    //simple for JAXB
    Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        if (children == null) {
            children = Collections.emptyList();
        }

        this.children = Collections.unmodifiableList(children);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]").add("firstName='" + firstName + "'")
                                                                              .add("lastName='" + lastName + "'")
                                                                              .add("children=" + children)
                                                                              .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && children.equals(person.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, children);
    }
}
