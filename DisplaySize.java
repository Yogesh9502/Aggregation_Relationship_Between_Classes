public class DisplaySize {

    float Width;
    float Height;
    Resolution Res;

    Resolution RS = new Resolution(1900, 1080);

    DisplaySize() {

    }

    DisplaySize(float Width, float Height, Resolution Res) {
        this.Width = Width;
        this.Height = Height;
        this.Res = Res;
    }

    public float getWidth() {
        return this.Width;
    }

    public float getHeight() {
        return this.Height;
    }

    public Resolution getRes() {
        return this.Res;
    }

    public void setWidth(float Width) {
        this.Width = Width;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public void setRes(Resolution Res) {
        this.Res = Res;
    }

    public void DisplayDetails() {
        System.out.println("Display Width is: " + Width);
        System.out.println("Display Height is: " + Height);
        RS.ResolutionDetails();
    }
}
