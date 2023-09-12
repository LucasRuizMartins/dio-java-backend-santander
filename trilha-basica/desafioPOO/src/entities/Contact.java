package entities;

import exceptions.FormatPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) throws IllegalArgumentException, FormatPhoneNumberException {
        if(!validarTelefone(phoneNumber)) {
            throw new FormatPhoneNumberException("Telefone inválido: " + phoneNumber);
        }
        this.name = name;
        this.phoneNumber = phoneNumber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!validarTelefone(phoneNumber)) {
            System.out.println("Telefone inválido: " + phoneNumber);
        } else {
            this.phoneNumber = phoneNumber;
         }
    }


    public boolean validarTelefone(String telefone) {

        String regex = "\\d{5}-\\d{4}";

        if (telefone.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }
}

