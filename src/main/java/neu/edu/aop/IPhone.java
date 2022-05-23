package neu.edu.aop;

import neu.edu.beans.CellPhone;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("iphone")
public class IPhone implements CellPhone {
    
    double price = 0;
    public void call(){
//        System.out.println("打你妈呢");
        long start = System.currentTimeMillis();
        try{
            Thread.sleep(new Random().nextInt(1000));
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("还搁这打呢");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public String sendMsg(String msg){
        System.out.println(msg);
        System.out.println("shabi");
        if (true)
            throw new RuntimeException();
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
