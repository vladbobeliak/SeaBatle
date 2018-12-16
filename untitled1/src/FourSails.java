public class FourSails extends Ship {
    void LocationOfShip(int xy[][]) {
        int direction = RandomDirection();

        int x,y,x1,x2,x3,y1,y2,y3;
        int lenght =  this.length;
            do {
                RandomXY();
                x = this.headx;
                y = this.heady;
            } while (xy[x][y] == 8);
            if (lenght == 4) {
                if (direction == 0) {
                    y1=y+1;y2=y1+1;y3=y2+1;
                    if((y+1)==11){y1=y-1;y2=y1-1;y3=y2-1;}
                    if((y+2)==11){y1=y+1;y2=y-1;y3=y2-1;}
                    if((y+3)==11){y1=y+1;y2=y1+1;y3=y-1;}
                    xy[x][y]=1;xy[x][y1]=1;xy[x][y2]=1;xy[x][y3]=1;

                    if(xy[x-1][y-1]==0){xy[x-1][y-1]=2;}
                    if(xy[x+1][y-1]==0){xy[x+1][y-1]=2;}
                    if(xy[x-1][y+1]==0){xy[x-1][y+1]=2;}
                    if(xy[x+1][y+1]==0){xy[x+1][y+1]=2;}
                    if(xy[x-1][y]==0){xy[x-1][y]=2;}
                    if(xy[x][y-1]==0){xy[x][y-1]=2;}
                    if(xy[x][y+1]==0){xy[x][y+1]=2;}
                    if(xy[x+1][y]==0){xy[x+1][y]=2;}

                    if(xy[x-1][y1-1]==0){xy[x-1][y1-1]=2;}
                    if(xy[x+1][y1-1]==0){xy[x+1][y1-1]=2;}
                    if(xy[x-1][y1+1]==0){xy[x-1][y1+1]=2;}
                    if(xy[x+1][y1+1]==0){xy[x+1][y1+1]=2;}
                    if(xy[x-1][y1]==0){xy[x-1][y1]=2;}
                    if(xy[x][y1-1]==0){xy[x][y1-1]=2;}
                    if(xy[x][y1+1]==0){xy[x][y1+1]=2;}
                    if(xy[x+1][y1]==0){xy[x+1][y1]=2;}

                    if(xy[x-1][y2-1]==0){xy[x-1][y2-1]=2;}
                    if(xy[x+1][y2-1]==0){xy[x+1][y2-1]=2;}
                    if(xy[x-1][y2+1]==0){xy[x-1][y2+1]=2;}
                    if(xy[x+1][y2+1]==0){xy[x+1][y2+1]=2;}
                    if(xy[x-1][y2]==0){xy[x-1][y2]=2;}
                    if(xy[x][y2-1]==0){xy[x][y2-1]=2;}
                    if(xy[x][y2+1]==0){xy[x][y2+1]=2;}
                    if(xy[x+1][y2]==0){xy[x+1][y2]=2;}

                    if(xy[x-1][y3-1]==0){xy[x-1][y3-1]=2;}
                    if(xy[x+1][y3-1]==0){xy[x+1][y3-1]=2;}
                    if(xy[x-1][y3+1]==0){xy[x-1][y3+1]=2;}
                    if(xy[x+1][y3+1]==0){xy[x+1][y3+1]=2;}
                    if(xy[x-1][y3]==0){xy[x-1][y3]=2;}
                    if(xy[x][y3-1]==0){xy[x][y3-1]=2;}
                    if(xy[x][y3+1]==0){xy[x][y3+1]=2;}
                    if(xy[x+1][y3]==0){xy[x+1][y3]=2;}
                    } //horizontally
                if (direction == 1) {
                    x1=x+1;x2=x1+1;x3=x2+1;
                    if((x+1)==11){x1=x-1;x2=x1-1;x3=x2-1;}
                    if((x+2)==11){x1=x+1;x2=x-1;x3=x2-1;}
                    if((x+3)==11){x1=x+1;x2=x1+1;x3=x-1;}
                    xy[x][y]=1;xy[x1][y]=1;xy[x2][y]=1;xy[x3][y]=1;

                    if(xy[x-1][y-1]==0){xy[x-1][y-1]=2;}
                    if(xy[x+1][y-1]==0){xy[x+1][y-1]=2;}
                    if(xy[x-1][y+1]==0){xy[x-1][y+1]=2;}
                    if(xy[x+1][y+1]==0){xy[x+1][y+1]=2;}
                    if(xy[x-1][y]==0){xy[x-1][y]=2;}
                    if(xy[x][y-1]==0){xy[x][y-1]=2;}
                    if(xy[x][y+1]==0){xy[x][y+1]=2;}
                    if(xy[x+1][y]==0){xy[x+1][y]=2;}

                    if(xy[x1-1][y-1]==0){xy[x1-1][y-1]=2;}
                    if(xy[x1+1][y-1]==0){xy[x1+1][y-1]=2;}
                    if(xy[x1-1][y+1]==0){xy[x1-1][y+1]=2;}
                    if(xy[x1+1][y+1]==0){xy[x1+1][y+1]=2;}
                    if(xy[x1-1][y]==0){xy[x1-1][y]=2;}
                    if(xy[x1][y-1]==0){xy[x1][y-1]=2;}
                    if(xy[x1][y+1]==0){xy[x1][y+1]=2;}
                    if(xy[x1+1][y]==0){xy[x1+1][y]=2;}

                    if(xy[x2-1][y-1]==0){xy[x2-1][y-1]=2;}
                    if(xy[x2+1][y-1]==0){xy[x2+1][y-1]=2;}
                    if(xy[x2-1][y+1]==0){xy[x2-1][y+1]=2;}
                    if(xy[x2+1][y+1]==0){xy[x2+1][y+1]=2;}
                    if(xy[x2-1][y]==0){xy[x2-1][y]=2;}
                    if(xy[x2][y-1]==0){xy[x2][y-1]=2;}
                    if(xy[x2][y+1]==0){xy[x2][y+1]=2;}
                    if(xy[x2+1][y]==0){xy[x2+1][y]=2;}

                    if(xy[x3-1][y-1]==0){xy[x3-1][y-1]=2;}
                    if(xy[x3+1][y-1]==0){xy[x3+1][y-1]=2;}
                    if(xy[x3-1][y+1]==0){xy[x3-1][y+1]=2;}
                    if(xy[x3+1][y+1]==0){xy[x3+1][y+1]=2;}
                    if(xy[x3-1][y]==0){xy[x3-1][y]=2;}
                    if(xy[x3][y-1]==0){xy[x3][y-1]=2;}
                    if(xy[x3][y+1]==0){xy[x3][y+1]=2;}
                    if(xy[x3+1][y]==0){xy[x3+1][y]=2;}
                    } //vertically
                }

}
}