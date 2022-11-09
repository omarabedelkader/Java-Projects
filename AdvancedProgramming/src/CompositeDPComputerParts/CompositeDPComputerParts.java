package CompositeDPComputerParts;

public class CompositeDPComputerParts {
    public static void main(String args[]){
        Component hd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "Ram");
        Component cpu = new Leaf(9000, "CPU");
        
        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite computer = new Composite("Computer");
        Composite motherBoard = new Composite("MotherBoard");
        
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        
        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);
        
        computer.addComponent(ph);
        computer.addComponent(cabinet);
        
        computer.showPrice();
    }
}
