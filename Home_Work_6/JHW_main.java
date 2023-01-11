package Home_Work_6;

import java.util.Scanner;

public class JHW_main {

  public static void main(String[] args) {
    Notebook[] nb = new Notebook[6];

    nb[0].mark = "Mark1";
    nb[0].serialNumber = "AA11L1000";
    nb[0].ssd = 1000;
    nb[0].ram = 1200;
    nb[0].monitorTechnology = "TN";
    nb[0].displayResolution = "SXGA";
    nb[0].operationSystem = "Linux";
    nb[0].price = 1000;

    nb[1].mark = "Mark1";
    nb[1].serialNumber = "AA11L1500";
    nb[1].ssd = 1500;
    nb[1].ram = 1200;
    nb[1].monitorTechnology = "TN";
    nb[1].displayResolution = "SXGA";
    nb[1].operationSystem = "Linux";
    nb[1].price = 1000;

    nb[2].mark = "Mark2";
    nb[2].serialNumber = "BB11";
    nb[2].ssd = 1500;
    nb[2].ram = 3600;
    nb[2].monitorTechnology = "IPS";
    nb[2].displayResolution = "SXGA";
    nb[2].operationSystem = "Windows 12";
    nb[2].price = 1350;

    nb[3].mark = "Apple";
    nb[3].serialNumber = "QB11A4";
    nb[3].ssd = 1500;
    nb[3].ram = 2400;
    nb[3].monitorTechnology = "IPS";
    nb[3].displayResolution = "WSXGA+";
    nb[3].operationSystem = "Macintosh: macOS 12.0 Monterey";
    nb[3].price = 2800;

    nb[4].mark = "Mark4";
    nb[4].serialNumber = "AA111DE";
    nb[4].ssd = 1000;
    nb[4].ram = 2400;
    nb[4].monitorTechnology = "IPS";
    nb[4].displayResolution = "WQHD";
    nb[4].operationSystem = "Эльбрус ОС";
    nb[4].price = 1002;

    nb[5].mark = "Mark1";
    nb[5].serialNumber = "AA11W";
    nb[5].ssd = 1000;
    nb[5].ram = 1200;
    nb[5].monitorTechnology = "TN";
    nb[5].displayResolution = "SXGA";
    nb[5].operationSystem = "Windows 12";
    nb[5].price = 2030;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите марку изделия: %s");
    String appMark = sc.nextLine();
    System.out.println("Введите серийный номер: %s");
    String appSerialNumber = sc.nextLine();

    for (int i = 0; i < nb.length; i++) {
      if (appMark.equals(nb[i].mark) &&
          appSerialNumber.equals(nb[i].serialNumber)) {
            System.out.printf("Такой ноутбук в наличии, по цене: %d", nb[i].price);
      } else break;
    }
    sc.close();
  }
}
