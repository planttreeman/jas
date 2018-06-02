package firstTest;

/**
 * descript
 *
 * @author orange
 *  2018/6/2
 */
public class Hero {
    private String name;
    private float hp;
    private float armor;
    private int moveSpeed;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }

    public static void main(String[] args) {
        Hero gailun=new Hero();
        gailun.name="盖伦";
        gailun.hp=214f;
        gailun.armor=432f;
        gailun.moveSpeed=543;

        System.out.println(gailun);

    }
}
