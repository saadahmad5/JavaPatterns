package BehavioralPatterns.ChainOfResponsibility.Authentication;

public abstract class AuthHandler implements IAuthenticate {

    AuthHandler next;

    AuthHandler(AuthHandler next) {
        this.next = next;
    }

    public void Authenticate(AuthMechanisms mechanism) {

        if (next != null) {
            this.next.Authenticate(mechanism);
        } else {
            System.err.println("This type of Authentication not supported");
        }

    }

}
