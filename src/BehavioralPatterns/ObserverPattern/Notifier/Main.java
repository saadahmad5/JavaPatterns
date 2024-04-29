package BehavioralPatterns.ObserverPattern.Notifier;

public class Main {

    public static void main(String[] args){

        Connection saad = new Connection();
        Connection fatima = new Connection();

        SocialMediaFeed smf = new SocialMediaFeed();

        saad.addPropertyChangeListener(smf);
        fatima.addPropertyChangeListener(smf);

        saad.setStatus("visiting Italia");
        fatima.setStatus("my favorite city is Florence");

        smf.printStatuses();
    }

}
