package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();//сюда будем заносить шифрование/дешифрование
        FactoryStore factoryStore = new FactoryStore();
        Encryption encNeed = factoryStore.orderEncryption(args);//передаем в этот метод массив для его обработки
        encNeed.encDec(encNeed, build);//шифруем/дешифруем

    }
}