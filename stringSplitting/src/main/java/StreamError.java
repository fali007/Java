import java.util.Arrays;
import java.util.List;

public class StreamError {

    public static String getError(String errMesage){
        String[] arr={"Error","ERROR"};
        for(int i=0;i<errMesage.length();i++){
            boolean flag=false;
            for(String s:arr){
                if(errMesage.startsWith(s,i)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                return errMesage.substring(i);
            }
        }
        return "Not found";
    }
    public static void getStreamError(String errMessage){
        List arr=Arrays.asList("Error","ERROR");
        boolean match = arr.stream().anyMatch(s->errMessage.contains((CharSequence) s));
        if(match){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static String getErrorNew(String errMesage){
        List<String> arr=Arrays.asList("Error","ERROR");
        final StringBuilder str = new StringBuilder();
        for(String st : arr) {
            if(errMesage.contains(st)) {
                str.append(errMesage.substring(errMesage.indexOf(st), errMesage.length()));
                break;
            }
        }
        System.out.println(str.toString());
        return str.toString();
    }

    public static void main(String[] args){
        String test="asdfg asd asd f asf as fsfa sf as ffsfs fsjfhs lsksdjhf yfhsd o7fysuysdoyhkdf tsd fsiudfy7y ERROR ashdk ahsduk sfhjsdgsdfskld hifoLSFHKJSDFGGU  IUFJKDSHhuisdfhdui yksdfuihf uvoifiuho;ufsd udshvkusdyk icasuvychaou9fuohvksusdoycklnfj u8fufdhiucysa hdfuh";
        long startTime = System.nanoTime();
        System.out.println(getError(test));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        startTime = System.nanoTime();
        getStreamError(test);
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        startTime = System.nanoTime();
        getErrorNew(test);
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
}
