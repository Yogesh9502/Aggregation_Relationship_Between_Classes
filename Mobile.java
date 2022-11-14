class Mobile {

    String Name;
    String Model;
    String Processor;
    DisplaySize Size;

    DisplaySize DS = new DisplaySize(6.14f, 5.15f, new Resolution());

    Mobile() {

    }

    Mobile(String Name, String Model, String Processor, DisplaySize Size) {
        this.Name = Name;
        this.Model = Model;
        this.Processor = Processor;
        this.Size = Size;
    }

    public String getName() {
        return this.Name;
    }

    public String getModel() {
        return this.Model;
    }

    public String getProcessor() {
        return this.Processor;
    }

    public DisplaySize getSize() {
        return this.Size;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public void setName(DisplaySize Size) {
        this.Size = Size;
    }

    public void MobileDetails() {
        System.out.println("The Mobile Name is: " + Name);
        System.out.println("The Mobile Model is: " + Model);
        System.out.println("The Mobile Processor is: " + Processor);
        DS.DisplayDetails();
    }
}
