public class Transformer {
    private String name;
    private Gun leftGun;
    private Gun rightGun;

    public Transformer() {

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Gun getLeftGun() {
        return leftGun;
    }

    public void setLeftGun(Gun leftGun) {
        this.leftGun = leftGun;
    }

    public Gun getRightGun() {
        return rightGun;
    }

    public Transformer(String name, Gun leftGun, Gun rightGun) {
        this.name = name;
        this.leftGun = leftGun;
        this.rightGun = rightGun;
    }

    public void setRightGun(Gun rightGun) {
        this.rightGun = rightGun;
    }

}
