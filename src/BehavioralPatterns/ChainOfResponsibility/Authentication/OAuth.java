package BehavioralPatterns.ChainOfResponsibility.Authentication;

public class OAuth extends AuthHandler {

    OAuth(AuthHandler next) {
        super(next);
    }

    @Override
    public void Authenticate(AuthMechanisms mechanism) {

        if (mechanism.equals(AuthMechanisms.OAuth)) {
            System.out.println("Authenticating using OAuth");
        } else {
            super.Authenticate(mechanism);
        }

    }

}
