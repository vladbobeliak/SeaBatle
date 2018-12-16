public class SeaBattle {
    public static void main(String[] args){
    Board Sea= new Board();
    //Sea.MakeBoard();

    FourSails fourSails = new FourSails();
    fourSails.setLength(4);
    fourSails.LocationOfShip(Sea.board);
    ThreeSails threeSails1=new ThreeSails();
    threeSails1.setLength(3);
    threeSails1.LocationOfShip(Sea.board);
   /* ThreeSails threeSails2=new ThreeSails();
    threeSails2.setLength(3);
    threeSails2.LocationOfShip(Sea.board);
    TwoSails twoSails1=new TwoSails();
    twoSails1.setLength(2);
    twoSails1.LocationOfShip(Sea.board);
    TwoSails twoSails2=new TwoSails();
    twoSails2.setLength(2);
    twoSails2.LocationOfShip(Sea.board);
        TwoSails twoSails3=new TwoSails();
        twoSails3.setLength(2);
        twoSails3.LocationOfShip(Sea.board);
        OneSails oneSails1=new OneSails();
        oneSails1.setLength(1);
        oneSails1.LocationOfShip(Sea.board);
        OneSails oneSails2=new OneSails();
        oneSails1.setLength(1);
        oneSails2.LocationOfShip(Sea.board);
        OneSails oneSails3=new OneSails();
        oneSails3.setLength(1);
        oneSails3.LocationOfShip(Sea.board);
        OneSails oneSails4=new OneSails();
        oneSails4.setLength(1);
        oneSails4.LocationOfShip(Sea.board);*/
    Sea.GiveBoard();

    }
}
