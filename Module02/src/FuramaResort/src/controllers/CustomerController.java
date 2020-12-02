package controllers;

import commons.DataValidate;
import models.Customer;
import models.House;
import models.Services;

import static controllers.MainController.scanner;

public class CustomerController {
    public static Customer inputCustomer() {
        Customer customer = new Customer();
        String inputData;
        System.out.println("--------------------");
        System.out.println("INPUT CUSTOMER INFORMATION: ");
        try {
            do {
                System.out.println("Name Customer:");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkNameCus(inputData));
            customer.setNameCus(inputData);
            do {
                System.out.print("2. Birthday Customer (dd/MM/yyyy): ");
                inputData = scanner.nextLine();
            } while (DataValidate.checkBirthday(inputData) && !DataValidate.check18YO(inputData) );
            customer.setBirthDay(inputData);
            do {
                System.out.print("3. Gender (Male|Famale|Unknown): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkGender(inputData));
            customer.setGender(inputData);
            do {
                System.out.print("4. Passport: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkPassport(inputData));
            customer.setPassPort(inputData);
            do {
                System.out.print("5. Telephone Number: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkTelephoneNum(inputData));
            customer.setTelephoneNumber(inputData);
            do {
                System.out.print("6. Email Customer: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkEmail(inputData));
            customer.setEmailCus(inputData);
            do {
                System.out.print("7. Type Customer (Diamond|Gold|Silver): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkTypeCus(inputData));
            customer.setTypeCus(inputData);

            System.out.print("8. Andress: ");
            inputData = scanner.nextLine();
            customer.setAndressCus(inputData);
            customer.setServices(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Some error, please reinput Customer");

        }finally {
            inputCustomer();
        }


        return customer;
    }
}
