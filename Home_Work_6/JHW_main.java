package Home_Work_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class JHW_main {

  public static void main(String[] args) {

    Notebook nb0 = new Notebook();
    nb0.mark = "Mark1";
    nb0.serialNumber = "AA11L1000";
    nb0.ssd = 1000;
    nb0.ram = 1200;
    nb0.monitorTechnology = "TN";
    nb0.displayResolution = "SXGA";
    nb0.operationSystem = "Linux";
    nb0.price = 1000;
    nb0.quantity = 908;
    nb0.nb_color = color(0, 1, 0, 1);

    Notebook nb1 = new Notebook();
    nb1.mark = "Mark1";
    nb1.serialNumber = "AA11L1500";
    nb1.ssd = 1500;
    nb1.ram = 1200;
    nb1.monitorTechnology = "TN";
    nb1.displayResolution = "SXGA";
    nb1.operationSystem = "Linux";
    nb1.price = 1000;
    nb1.quantity = 4;
    nb1.nb_color = color(1, 1, 0, 0);

    Notebook nb2 = new Notebook();
    nb2.mark = "Mark2";
    nb2.serialNumber = "BB11";
    nb2.ssd = 1500;
    nb2.ram = 3600;
    nb2.monitorTechnology = "IPS";
    nb2.displayResolution = "SXGA";
    nb2.operationSystem = "Windows 12";
    nb2.price = 1350;
    nb2.quantity = 99;
    nb2.nb_color = color(1, 1, 0, 1);

    Notebook nb3 = new Notebook();
    nb3.mark = "Apple";
    nb3.serialNumber = "QB11A4";
    nb3.ssd = 1500;
    nb3.ram = 2400;
    nb3.monitorTechnology = "IPS";
    nb3.displayResolution = "WSXGA+";
    nb3.operationSystem = "Macintosh: macOS 12.0 Monterey";
    nb3.price = 2800;
    nb3.quantity = 102;
    nb3.nb_color = color(0, 0, 1, 1);

    Notebook nb4 = new Notebook();
    nb4.mark = "Mark4";
    nb4.serialNumber = "AA111DE";
    nb4.ssd = 1000;
    nb4.ram = 2400;
    nb4.monitorTechnology = "IPS";
    nb4.displayResolution = "WQHD";
    nb4.operationSystem = "Эльбрус ОС";
    nb4.price = 1027;
    nb4.quantity = 811;
    nb4.nb_color = color(0, 0, 0, 1);

    Notebook nb5 = new Notebook();
    nb5.mark = "Mark1";
    nb5.serialNumber = "AA11W";
    nb5.ssd = 1000;
    nb5.ram = 1200;
    nb5.monitorTechnology = "TN";
    nb5.displayResolution = "SXGA";
    nb5.operationSystem = "Windows 12";
    nb5.price = 2030;
    nb5.quantity = 90;
    nb5.nb_color = color(1, 0, 0, 1);

    Notebook[] notebooks = new Notebook[6];
    notebooks[0] = nb0;
    notebooks[1] = nb1;
    notebooks[2] = nb2;
    notebooks[3] = nb3;
    notebooks[4] = nb4;
    notebooks[5] = nb5;
    for (int i = 0; i < notebooks.length; i++) {
      for (int j = 0; j < notebooks[i].nb_color.length; j++) {
        if (notebooks[i].nb_color[j] ==
            findNotebook(notebooks[i].ram, notebooks[i].ssd,
                         notebooks[i].operationSystem, notebooks)
                .get(i)
                .nb_color[j]) {
          findNotebook(notebooks[i].ram, notebooks[i].ssd,
                       notebooks[i].operationSystem, notebooks)
              .put(i, notebooks[i]);
          System.out.printf(
              "Ваш ноутбук марки %s серийный номер %s цвета %s в наличии",
              notebooks[i].mark, notebooks[i].serialNumber,
              notebooks[i].nb_color[j]);
        } else {
          System.out.println("Ошибка");
        }
      }
    }
  }

  private static boolean isColor(int isColor) {
    if (isColor == 0)
      return false;
    else
      return true;
  }

  public static String[] color(int i, int j, int k, int l) {
    String[] colorCor = new String[4];
    boolean isColor = isColor(i);
    if (!isColor) {
      colorCor[0] = "Белый";
    } else
      colorCor[0] = "";
    isColor = isColor(j);
    if (!isColor) {
      colorCor[1] = "Розовенький";
    } else
      colorCor[1] = "";
    isColor = isColor(k);
    if (!isColor) {
      colorCor[2] = "Зелёненький";
    } else
      colorCor[2] = "";
    isColor = isColor(l);
    if (!isColor) {
      colorCor[3] = "Чёрный";
    } else
      colorCor[3] = "";
    return colorCor;
  }

  public static Map<Integer, Notebook>
  findNotebook(int appRam, int appSSD, String operationSys, Notebook[] note) {
    var nbSet = new HashSet<Notebook>(
        Arrays.asList(note[0], note[1], note[2], note[3], note[4], note[5]));
    LinkedList<Notebook> nb = new LinkedList<>();
    nb.addAll(nbSet);
    Scanner sc = new Scanner(System.in);
    System.out.println("ОЗУ: ");
    appRam = sc.nextInt();
    System.out.println("Объём SSD: ");
    appSSD = sc.nextInt();
    System.out.println("Операционная система: ");
    operationSys = sc.nextLine();
    Map<Integer, Object> findMap = new HashMap<>();
    findMap.put(0, appRam);
    findMap.put(1, appSSD);
    findMap.put(2, operationSys);
    sc.close();
    Map<Integer, Notebook> mapNotebook = new HashMap<>();
    for (int i = 0; i < note.length; i++) {
      if (findMap.get(0).equals(nb.get(i).ram) &&
          findMap.get(1).equals(nb.get(i).ssd) &&
          findMap.get(2).equals(nb.get(i).operationSystem)) {
        mapNotebook.put(i, nb.get(i));
      }
    }
    return mapNotebook;
  }
}
