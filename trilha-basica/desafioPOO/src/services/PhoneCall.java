package services;

import entities.Contact;
import entities.VoiceMail;

import java.util.ArrayList;
import java.util.List;

public class PhoneCall {

    List<Contact> contacts = new ArrayList<>();
    List<VoiceMail> vMails = new ArrayList<>();
    public void callPhone(Contact contact){
        System.out.println("discando para " + contact.getName() + "...");
    }

    public void answerCall(){
        System.out.println("atendendo chamada");
    }

    public void startVoiceMail(VoiceMail voiceMail){
        System.out.println();
        System.out.println("Iniciando mensagem de voz de " + voiceMail.getName());
        System.out.println("A mensagem possui " + voiceMail.getDuration() + " minutos");
        System.out.println();
        System.out.println();
        System.out.println(voiceMail.getMessage());
    }


    public List<Contact> addPhone(Contact contact){
        contacts.add(contact);
        return contacts;
    }

    public List<VoiceMail> addVoiceMail(VoiceMail voiceMail) {
        vMails.add(voiceMail);
        return vMails;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<VoiceMail> getvMails() {
        return vMails;
    }
}
