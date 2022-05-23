package neu.edu.beans;

import org.springframework.stereotype.Component;


public interface CellPhone {
    public void call();
    public String sendMsg(String msg);

}
