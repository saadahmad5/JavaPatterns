package BehavioralPatterns.ChainOfResponsibility.Authentication;

public class BasicAuth extends AuthHandler {

    BasicAuth(AuthHandler next) {
        super(next);
    }

    @Override
    public void Authenticate(AuthMechanisms mechanism) {

        if (mechanism.equals(AuthMechanisms.Basic)) {
            System.out.println("Authenticating using Basic Auth");
        } else {
            super.Authenticate(mechanism);
        }

    }

}
