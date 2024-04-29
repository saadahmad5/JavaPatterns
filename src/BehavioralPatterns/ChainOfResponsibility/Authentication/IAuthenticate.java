package BehavioralPatterns.ChainOfResponsibility.Authentication;

public interface IAuthenticate {

    void Authenticate(AuthMechanisms mechanism);

}
