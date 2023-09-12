import entities.*;
import exceptions.FormatPhoneNumberException;
import services.MusicPlayer;
import services.PhoneCall;

public class Main {
    public static void main(String[] args) throws FormatPhoneNumberException {


        Album whiteAlbum = new Album("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/TheBeatles68LP.jpg/220px-TheBeatles68LP.jpg" , "22/11/1968");
        Music m1 = new Music ("Julia", "The Beatles", 4, 2.57);
        Music m2 = new Music("Rocky Raccoon" , "The Beatles", 3, 3.33);
        whiteAlbum.addMusic(m1);
        whiteAlbum.addMusic(m2);

        MusicPlayer mp = new MusicPlayer();
        mp.selectMusic(m1,whiteAlbum);
        mp.stopMusic();

        PhoneCall pc = new PhoneCall();
        Contact c1 = new Contact("Lucas", "91678-1234");
        Contact c2 = new Contact("Matheus", "91234-2345");
        Contact c3 = new Contact("Carlos", "91234-3456");
        pc.addPhone(c1);
        pc.addPhone(c2);
        pc.addPhone(c3);
        pc.callPhone(c1);

        VoiceMail vm1 = new VoiceMail(0.10, "Lucas" , "Ola tudo bem? me ligue quando puder");
        pc.addVoiceMail(vm1);
        pc.startVoiceMail(vm1);

        WebBrowser wb = new WebBrowser("www.google.com",1);
        wb.addTab();
        wb.reloadTab();

    }
}