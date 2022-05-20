package exercise;

public class StringByteWorker {
    public String process(byte[] bytes){
        String proc = new String(bytes);
        return proc.toLowerCase();
    }
}
