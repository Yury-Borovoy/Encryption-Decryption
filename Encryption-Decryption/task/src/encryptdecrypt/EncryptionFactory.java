package encryptdecrypt;


abstract public class EncryptionFactory{
/*
Абстрактный фабричный класс, который обрабатывает поступаемый массив данных и определяет какой алгоритм нужен
 */
    abstract Encryption createEncryption(String alg, int key, String mode, String data, String in, String out);

    Encryption orderEncryption(String[] args){
        String alg = "shift";
        int key = 0;
        String mode = "enc";
        String data = "";
        String in = "";
        String out = "";

        for(int i = 0; i < args.length; i += 2){
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    in = args[i + 1];
                    break;
                case "-out":
                    out = args[i + 1];
                    break;
                case"-alg":
                    alg = args[i + 1];
            }
        }

        return createEncryption(alg, key, mode, data, in, out);
    }
}