package spaceship;    // a grouping of classes
//hi

  
// xEBGBx was here :D

  
// Bob Severinghaus, 27Apr17

public class spaceship {
    double speed;  // speed of spaceship
    int movex, movey;   // velocity in x and y
    int x, y;   // position of the ship
   
    // constructor
    spaceship(int movex_ , int movey_, int x_, int y_){
        movex = movex_;
        movey = movey_;
        x = x_;
        y = y_;
        speed = Math.sqrt ((movex * movex) + (movey * movey));
    }
    // overloaded constructor
    spaceship(int movex_, int movey_){
        this(movex_, movey_, 0, 0);
    }
    // a method for moving the spaceship
    void moveSpaceShip() {
        x += movex;
        y += movey;
    }
    // a method for turning the spaceship
    /**
     * Rotates spaceship.
     * In this frame of reference, 0 degrees is North and it turns clockwise.
     * @param angle Angle in degrees
     */
    public void rot(double angle) {
        double currentAngle = Math.toDegrees(Math.atan((double) movey / movex));
        System.out.println("Current angle: " + Double.toString(currentAngle));
        double newAngle = 90 - (currentAngle + angle);
        System.out.println("New angle: " + Double.toString(newAngle));
        int newX = (int) (Math.cos(Math.toRadians(newAngle)) * speed);
        int newY = (int) (Math.sin(Math.toRadians(newAngle)) * speed);
        double actualAngle = 90 - Math.toDegrees(Math.atan((double) newY / newX));
        System.out.println("New X: " + Integer.toString(newX));
        System.out.println("New Y: " + Integer.toString(newY));
        movex = newX;
        movey = newY;
        System.out.println("Actual angle: " + Double.toString(actualAngle));
        
        
        
    }
    // a method to display the position of the spaceship
    public void pos (int x, int y){
        System.out.println("X: " + x + "\n" + "Y: " + y);
    }
   
    // a method to display the distance between spaceships and
    public double distance(int shipx, int shipy){
        double out =0;
        double deltaX = x - shipx;
        double deltaY = y - shipy;
        out = Math.sqrt ((deltaX * deltaX) + (deltaY * deltaY));
        return out;
    }
    
    public void move(){
        System.out.println("Hi");
    }
    
    private static class Manager{
        
        Bob objs[];
        int currentIndex = 0;
        int len = 0;
        Manager(Bob b, int number){
            objs = new Bob[number];
            len = number;
            objs[currentIndex] = b;
            currentIndex++;
        }
        Manager(int number){
            objs = new Bob[number];
            len = number;
        }
        
        public void addMember(Bob b){
            objs[currentIndex] = b;
            currentIndex++;
        }
        
        public void update(){
            if(objs.length == len){
                for(int i = 0; i < len; i++){
                    objs[i].move();
                }
            }else{
                System.err.println("ERROR: Manager not filled.");
            }
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        // create 2 spaceships with different names
        Bob s = new Bob(32, 43, 0, 0);
        s.rot(90);
        
        
        // some movement of the spaceship over 3 turns
       
    }
   
}
