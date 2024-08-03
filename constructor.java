class Box {
    int width,height,depth;
    Box(){
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(int w,int h,int d){
        width = w;
        height = h;
        depth = d;
    }
    int volume(){
        return width*height*depth;
    }
    void display(){
        System.out.println(width + " " + height +" " + depth);
    }
}

public class constructor {
    public static void main(String args[]){
        int vol1,vol2;
        Box b1 = new Box();
        b1.display();
        Box b2 = new Box(20,30,40);
        b2.display();  
        vol1 = b1.volume();
        vol2 = b2.volume();
        System.out.println("Volume1 ="+ vol1 +" Volume2 ="+ vol2);
    }
}
