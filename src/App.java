import javadraw.*;

public class App extends Window{

    Oval player;
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){

        player = new Oval(screen, 10, 300, 50, 50);
        Rectangle obstacle = new Rectangle(screen, 400, 200, 50, 400);

        while (true){
            if(player.overlaps(obstacle)){
                obstacle.move(5, 0);
            }
            screen.update();
            screen.sleep(1/30.0);
        }
    }

    public void mouseMove(Location location){
        player.center(location);
    }
}
