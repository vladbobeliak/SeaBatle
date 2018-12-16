public class OneSails extends Ship {
    void LocationOfShip(int xy[][]) {
        int direction = RandomDirection();
        int x,y;
        int lenght =  this.length;
        do {
            RandomXY();
            x = this.headx;
            y = this.heady;
        } while (xy[x][y]==2);
        if (lenght == 1) {
            xy[x][y]=1;

            if(xy[x-1][y-1]==0){xy[x-1][y-1]=2;}
            if(xy[x+1][y-1]==0){xy[x+1][y-1]=2;}
            if(xy[x-1][y+1]==0){xy[x-1][y+1]=2;}
            if(xy[x+1][y+1]==0){xy[x+1][y+1]=2;}
            if(xy[x-1][y]==0){xy[x-1][y]=2;}
            if(xy[x][y-1]==0){xy[x][y-1]=2;}
            if(xy[x][y+1]==0){xy[x][y+1]=2;}
            if(xy[x+1][y]==0){xy[x+1][y]=2;}
        }


    }
}
