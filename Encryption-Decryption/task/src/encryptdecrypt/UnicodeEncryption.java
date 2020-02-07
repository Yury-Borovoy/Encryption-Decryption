package encryptdecrypt;

public class UnicodeEncryption extends Encryption{


    public UnicodeEncryption(String mode, String data, String in, String out, int key) {
        super(mode, data, in, out, key);
    }

    @Override
    public void encryptionData(String data, int key, StringBuilder build) {
        for(char symbol: data.toCharArray()){
            build.append((char) (symbol + key));
        }

    }

    @Override
    public void decryptionData(String data, int key, StringBuilder build) {
        for(char symbol: data.toCharArray()){
            build.append((char) (symbol - key));
        }

    }
}
