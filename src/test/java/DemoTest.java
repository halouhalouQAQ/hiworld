
import com.domain.Demo01;
import com.domain.Pig;
import com.domain.World;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object demo01 = applicationContext.getBean("pig",Object.class);
        //System.out.println(demo01);
        //bean.aa();
        // System.out.println(bean.getUsername());
        //log.info("对象成功注入 -> {}", bean.getUsername());
       // AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Demo01.class);
        //Person person1 = applicationContext.getBean("person1", Person.class);
        //Person person2 = applicationContext.getBean("person1", Person.class);
        //System.out.println(person1.hashCode());
        //System.out.println(person2.hashCode());
    }
}