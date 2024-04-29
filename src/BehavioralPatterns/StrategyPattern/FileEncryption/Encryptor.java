package BehavioralPatterns.StrategyPattern.FileEncryption;

public interface Encryptor {

    String encryptFile();

    Encryptor applyAESEncryption = () -> "Applying AES encryption";

    Encryptor applyRSAEncryption = () -> "Applying RSA encryption";

}
