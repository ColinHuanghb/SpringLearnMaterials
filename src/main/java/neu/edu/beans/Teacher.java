package neu.edu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ttt")
@Scope("prototype")
public class Teacher {
    String name;
    //@Autowired  // by type 来自动注入
    CellPhone phone;

    public String getName() {
        return name;
    }

    @Autowired //上下两种放置位置都行
    @Qualifier("iphone")
    public void setPhone(CellPhone phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
