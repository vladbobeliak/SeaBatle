public class TwoSails extends Ship {
    void LocationOfShip(int xy[][]) {
        int direction = RandomDirection();
        int x,y,x1 = 0,y1 = 0;
        int lenght =  this.length;
        do {
            do {
                RandomXY();
                x = this.headx;
                y = this.heady;
            } while (xy[x][y] == 8);
            if (lenght == 2) {
                if (direction == 0) {
                    y1 = y + 1;
                    if ((y + 1) == 11) {
                        y1 = y - 1;
                    }


                } //horizontally
                if (direction == 1) {
                    x1 = x + 1;
                    if ((x + 1) == 11) {
                        x1 = x - 1;
                    }

                } //vertically
            }
        }while ((xy[x][y]==2)||(xy[x1][y]==2)||(xy[x][y1]==2));
        if (direction == 0) {
            xy[x][y] = 1;
            xy[x][y1] = 1;

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

        }
        if (direction == 1) {
            xy[x][y] = 1;
            xy[x1][y] = 1;

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
        }
    }
}
