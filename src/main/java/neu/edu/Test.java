package neu.edu;

import neu.edu.beans.CellPhone;
import neu.edu.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//        CellPhone phone = (CellPhone) ctx.getBean("phone");
//        phone.call();
//        System.out.println(phone);

//        Teacher teacher = (Teacher) ctx.getBean("ttt");
//        Teacher teacher2 = (Teacher) ctx.getBean("teacher");
        // bean注入出来的是singleton的
//        System.out.println(teacher);
        CellPhone phone = (CellPhone) ctx.getBean("iphone");
        phone.call();
        phone.sendMsg("Apple");
    }

    public void m1(){
//        logger("m1 starts");

    }
}