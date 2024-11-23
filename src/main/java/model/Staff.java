package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@AllArgsConstructor
@Data
@ToString
public class Staff {
    private String name;
    private int age;
    private String department;
}
