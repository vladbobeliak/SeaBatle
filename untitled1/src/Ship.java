public class Ship {

    protected int length;
   protected  int direction;
   protected  int headx;
   protected  int heady;
    public int getLength() { return length; }
    public int getDirection() { return direction; }
    public int getHeadx() { return headx; }
    public int getHeady() { return heady; }
    public void setLength(int length) {
        if((length>=1)||(length<=4)){
        this.length = length;}
    }
    public void setDirection(int direction) {
        if((direction>=1)||(direction<=4)){
        this.direction = direction;}
    }
    public void setHeadX(int headx) {
        this.headx = headx;
    }
    public void setHeadY(int heady) {
        this.heady = heady;
    }
    void RandomXY(){
        this.headx=(1*(int)(Math.random()*10))+1;
        this.heady=(1*(int)(Math.random()*10)+1);
        return;
    }
    int RandomDirection(){
        this.direction=(int)(Math.random()*2);
        return this.direction;
    }


}
