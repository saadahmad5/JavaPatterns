package BehavioralPatterns.ChainOfResponsibility.Authentication;

public class Client {

    public static void main(String[] args){

        AuthHandler auth = new BasicAuth(new OAuth(null));

        auth.Authenticate(AuthMechanisms.OAuth);
        auth.Authenticate(AuthMechanisms.Basic);

        // BOGUS
        auth.Authenticate(AuthMechanisms.ManagedIdentity);

    }

}
