import com.example.demo.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestInter {


    public static void main(String[] args) {
        //Sort Employee based on gender and age is above 30 using

        List<Emp> empList= new ArrayList<>();

        empList.add(new Emp(36,"male"));
        empList.add(new Emp(24,"female"));
        empList.add(new Emp(32,"female"));
        empList.add(new Emp(21,"male"));

        System.out.println(
                empList.stream().filter(x->x.getAge()>30).collect(Collectors.groupingBy(Emp::getGender))

                );







    }
}
