package encryptdecrypt;


public class ShiftEncryption extends Encryption{
    char a = 'a';
    char z = 'z';
    char aBig = 'A';
    char zBig = 'Z';
    int size = 26;

    public ShiftEncryption(String mode, String data, String in, String out, int key) {
        super(mode, data, in, out, key);
    }

    @Override
    public void encryptionData(String data, int key, StringBuilder build) {
        for (char symbol : data.toCharArray()) {
            if (symbol >= a && symbol <= z) {
                build.append((char) (((symbol - a + key) % size) + a));
            } else if(symbol >= aBig && symbol <= zBig) {
                build.append((char) (((symbol - aBig + key) % size) + aBig));
            }else{
                build.append(symbol);
            }
        }
    }

    @Override
    public void decryptionData(String data, int key, StringBuilder build) {
        for (char symbol : data.toCharArray()) {
            if (symbol >= a && symbol <= z) {
                if((char)(symbol - key) < a) {
                    build.append((char) ((symbol - key) + size));
                }else{
                    build.append((char) (symbol - key));
                }
            } else if(symbol >= aBig && symbol <= zBig) {
                if((char)(symbol - key) < aBig) {
                    build.append((char) ((symbol - key) + size));
                }else{
                    build.append((char) (symbol - key));
                }
            }else{
                build.append(symbol);
            }
        }
    }
}