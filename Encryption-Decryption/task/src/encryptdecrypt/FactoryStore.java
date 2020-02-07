package encryptdecrypt;

public class FactoryStore extends EncryptionFactory{
/*
В этом классе обрабатывается массив, который вводится из командной строки, и создается экземпляр
нужного нам класса алгоритма
 */
    @Override
    Encryption createEncryption(String alg, int key, String mode, String data, String in, String out) {
        if(alg.equals("shift")) {
            return new ShiftEncryption(mode, data,in, out, key);
        }else{
            return new UnicodeEncryption(mode, data, in, out, key);
        }
    }
}