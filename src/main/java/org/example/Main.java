package org.example;


import static java.time.temporal.ChronoUnit.*;

import java.time.LocalDate;


public class Main {

  public static void main(String[] args) {
    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate.of(2024, 4, 30);

    long daysBetween = DAYS.between(date1, date2);

    if (date1.equals(date2)) {
      System.out.println("予定日です。");
    }
    //予定日より前
    else if (date1.isBefore(date2)) {
      System.out.println("予定日まであと" + daysBetween + "日です。");

    }
    //予定日より後
    else {
      System.out.println("予定日を" + -daysBetween + "日過ぎました。");

    }
  }

}
