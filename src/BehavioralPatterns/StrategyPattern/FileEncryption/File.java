package BehavioralPatterns.StrategyPattern.FileEncryption;

public class File {

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void applyEncryption(Encryptor encryptor) {
        System.out.println(encryptor.encryptFile() + " to " + fileName);
    }

}
