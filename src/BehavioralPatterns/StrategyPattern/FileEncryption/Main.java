package BehavioralPatterns.StrategyPattern.FileEncryption;

public class Main {

    public static void main(String[] args){

        File file = new File("test.pdf");

        file.applyEncryption(Encryptor.applyAESEncryption);
        file.applyEncryption(Encryptor.applyRSAEncryption);

    }

}
