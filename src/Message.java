import java.io.Serializable;

public class Message implements Serializable {
    public int a,b,sum;

    public Message(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setSum(int i){
        sum = i;
    }
}
