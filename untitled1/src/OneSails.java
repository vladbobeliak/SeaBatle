public class OneSails extends Ship {
    void LocationOfShip(int xy[][]) {
        int direction = RandomDirection();
        int x,y;
        int lenght =  this.length;
        do {
            RandomXY();
            x = this.headx;
            y = this.heady;
        } while (xy[x][y] == 8);
        if (lenght == 1) {
            xy[x][y]=2;
        }

    }
}
