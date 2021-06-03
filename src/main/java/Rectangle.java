//import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

public class Rectangle {
    private int height;
    private int width;
//    List<String> myList = new ArrayList<>();
//    private static List<Rectangle> mInstances =
private static ArrayList<Rectangle> mInstances = new ArrayList<>();
    private Boolean shape;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.shape = isRectSquare();
        this.mInstances.add(this);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
//    @Contract(pure = true)
    public static ArrayList<Rectangle> getAll() {
        return mInstances;
    }

    public boolean getShape(){
        return shape;
    }

    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }

}