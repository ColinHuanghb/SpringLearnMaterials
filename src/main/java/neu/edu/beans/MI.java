package neu.edu.beans;

import org.springframework.stereotype.Component;

@Component
public class MI implements CellPhone{
    @Override
    public void call() {
        System.out.println("dingdongding");
    }

    @Override
    public String sendMsg(String msg) {
        System.out.println(msg);
        System.out.println("相信美好的事情即将发生");
        return msg;
    }
}
