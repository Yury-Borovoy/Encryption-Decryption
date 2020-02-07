package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract public class Encryption{
    private int key;
    private String data;
    private String mode;
    private String in;
    private String out;

    public Encryption(String mode, String data, String in, String out, int key){
        this.mode =mode;
        this.data = data;
        this.in = in;
        this.out = out;
        this.key = key;
    }

    //GETTERS and SETTERS
    public int getKey(){
        return key;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getMode(){
        return mode;
    }
    public String getIn() {
        return in;
    }
    public String getOut(){
        return out;
    }

    public void encDec(Encryption encryption, StringBuilder build){
        if(!encryption.getIn().matches("")){
            try {
                File file = new File(encryption.getIn());
                Scanner scan = new Scanner(file);
                encryption.setData(scan.nextLine());
                System.out.println(encryption.getData());
                scan.close();
                if (encryption.getMode().matches("dec")) {
                    decryptionData(encryption.getData(), encryption.getKey(), build);
                } else {
                    encryptionData(encryption.getData(), encryption.getKey(), build);
                }
                if (!encryption.getOut().matches("")) {
                    FileWriter writer = new FileWriter(encryption.getOut());
                    writer.write(String.valueOf(build));
                    System.out.println((build));
                    writer.close();
                    System.out.println(encryption.getOut());
                } else {
                    System.out.println(build);
                }
            } catch(IOException e){
                System.out.println("Error");
            }
        }else{
            if(encryption.getData().matches("")){
                System.out.println();
            }else{
                if(encryption.getMode().matches("dec")){
                    decryptionData(encryption.getData(), encryption.getKey(), build);
                }else{
                    encryptionData(encryption.getData(), encryption.getKey(), build);
                }
            }
            System.out.println(build);
        }

    }

    abstract  public void encryptionData(String data, int key, StringBuilder build);
    abstract  public void decryptionData(String data, int key, StringBuilder build);
}