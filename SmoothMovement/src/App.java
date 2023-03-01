import javadraw.*;

public class App extends Window{
    boolean up, down, left, right = false;


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }


    public void keyDown(Key key){
        if(key == key.UP){
            up = true;
        }

    }

    public void keyUp(Key key){
        if(key == key.UP){
            up = false;
        }

    }

}
