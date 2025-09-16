
import org.example.enums.LampType;
import org.example.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall w1 = new Wall("North");
        Wall w2 = new Wall("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");

        Ceiling ceiling = new Ceiling(270, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 50, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 8);
        Wardrobe wardrobe = new Wardrobe(120, 220, 85.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom(
                "Master",
                w1, w2, w3, w4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        // Örnek metod çağrıları
        w1.create();
        ceiling.create();
        bed.make();
        lamp.turnOn();
        wardrobe.add();
        carpet.lying();

        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Ceiling color: " + bedroom.getCeiling().getColor());
    }
}
