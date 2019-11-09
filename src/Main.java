import com.ivoninsky.task1.*;


public class Main {
    public static void main(String[] args) {
        /*Picture p = new Picture();
        Figure f = new Square(7);
        Figure z = new Rectangle(5, 3);
        Figure u = new Circle(5);
        Figure u1 = new Circle(6);
        Figure o = new Sphere(5);
        Figure i = new Square(2);

        p.addToList(f);
        p.addToList(z);
        p.addToList(u);
        p.addToList(u1);
        p.addToList(o);
        p.addToList(i);
        System.out.println(p.getMapWithNamesAndCountOfFigures());*/

        BattleShip b = new BattleShip();
        b.addShipsToField();
        b.printField();

        /*BattleShip2 b = new BattleShip2();
        Ship ship = new Ship(4);
        b.addShipToField(ship);
        b.printField2();*/
    }

}
