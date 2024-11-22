package by._java_SE._8_interfaces;

public class WaterPipe implements Stateable{
    @Override
    public void printState(int n) {
        if(n==OPEN){
            System.out.println("Water is opened");
        }else  if (n==CLOSED){
            System.out.println("Water is closed");
        }else {
            System.out.println("Water is invalid");
        }
    }
}
