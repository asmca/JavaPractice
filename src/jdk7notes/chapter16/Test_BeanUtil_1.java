package jdk7notes.chapter16;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by suse on 1/29/15.
 */
public class Test_BeanUtil_1 {
    public static void main(String[] args) throws Exception{

        Map<String, Object> data = new HashMap<>();
        data.put("name", "justine");
        data.put("score",90);

        Student student = (Student) BeanUtil.getBeans(data, "jdk7notes.chapter16.Student");

        System.out.printf("(%s, %d)%n", student.getName(),  student.getScore());
    }
}
