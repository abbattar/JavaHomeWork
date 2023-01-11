package Home_Work_6;

public class Notebook {
  String serialNumber;
  String mark;
  int ssd;
  int ram;
  String monitorTechnology;
  String displayResolution;
  String operationSystem;
  int price;

  @Override
  public String toString() {
    return String.format(
        "serial_number:%s, mark:%s, ssd:%d, ram:%d, monitorTechnology:%s, displayResolution:%s, operationSystem:%s, price:%d",
        serialNumber, mark, ssd, ram, monitorTechnology, price);
  }
  @Override
  public int hashCode() {
    int hashInt = 1;
    return hashInt + (serialNumber == null ? 0 : serialNumber.hashCode());
  }
  @Override
    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return serialNumber == t.serialNumber && mark == t.mark;
    }
}
