package neu.edu.beans;

import neu.edu.beans.CellPhone;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component("iphone")
public class IPhone implements CellPhone {

    double price = 0;
    public void call(){
        System.out.println("打你妈呢");

    }

    @Override
    public String sendMsg(String msg) {
        return msg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "price=" + price +
                '}';
    }
}
