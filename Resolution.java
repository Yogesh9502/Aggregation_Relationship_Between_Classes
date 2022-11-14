public class Resolution {

    int Binary;
    int Secondary;

    Resolution() {

    }

    Resolution(int Binary, int Secondary) {
        this.Binary = Binary;
        this.Secondary = Secondary;
    }

    public int getBinary() {
        return this.Binary;
    }

    public int getSecondary() {
        return this.Secondary;
    }

    public void setBinary(int Binary) {
        this.Binary = Binary;
    }

    public void setSecondary(int Secondary) {
        this.Secondary = Secondary;
    }

    public void ResolutionDetails() {
        System.out.println("Resolution is: " + this.Binary + " X " + this.Secondary);
    }
}
