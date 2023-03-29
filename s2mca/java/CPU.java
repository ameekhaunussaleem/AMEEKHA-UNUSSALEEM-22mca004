public class CPU {
private double price;
private Processor processor;
private RAM ram;
public CPU(double price, int processorCores, String processorManufacturer,int ramMemory,String ramManufacturer) {
this.price = price;
this.processor = new Processor(processorCores, processorManufacturer);
this.ram = new RAM(ramMemory, ramManufacturer);
}
public double getPrice() {
return price;
}
public Processor getProcessor() {
return processor;
}
public RAM getRam() {
return ram;
}
public static class RAM {
private int memory;
private String manufacturer;
public RAM(int memory, String manufacturer) {
this.memory = memory;
this.manufacturer = manufacturer;
}
public int getMemory() {
return memory;
}
public String getManufacturer() {
return manufacturer;
}
}
public class Processor {
private int cores;
private String manufacturer;
public Processor(int cores, String manufacturer) {
this.cores = cores;
this.manufacturer = manufacturer;
}
public int getCores() {
return cores;
}
public String getManufacturer() {
return manufacturer;
}
}
public static void main(String[] args) {
CPU cpu = new CPU(500.0, 8, "Intel", 16, "Corsair");
System.out.println("CPU price: $" + cpu.getPrice());
System.out.println("Processor: " + cpu.getProcessor().getManufacturer() + " " + cpu.getProcessor().getCores() + " cores");
System.out.println("RAM: " + cpu.getRam().getManufacturer() + " " + cpu.getRam().getMemory() + " GB");
}
}
