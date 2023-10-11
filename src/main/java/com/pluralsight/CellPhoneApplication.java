package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(myscanner.nextInt());
        myscanner.nextLine();

        System.out.print("What model is the phone? ");
        phone.setModelPhone(myscanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(myscanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(myscanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(myscanner.nextLine());
        System.out.println(" ");
        System.out.print("Serial #: " + phone.getSerialNumber());
        System.out.println("\nPhone Model: " + phone.getModelPhone());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());


    }
}
