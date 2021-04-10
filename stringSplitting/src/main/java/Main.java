import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, ArrayList<String>> val=new HashMap();
    public static void main(String[] args) {
        Object message = "993 <14>1 2021-02-27T03:52:07.008046+00:00 DigitalINVOrg.PROD.prism-common-error-routing-service-temp f07381b0-52b1-4f7f-984e-60ebbfe6825d [APP/PROC/WEB/1] - [tags@47450 app_id=\"f07381b0-52b1-4f7f-984e-60ebbfe6825d\" app_name=\"prism-common-error-routing-service-temp\" deployment=\"cf-da95855c64c811f273f1\" index=\"ed3d18e2-68f0-4a88-9caa-887ca877193f\" instance_id=\"1\" ip=\"172.16.0.206\" job=\"diego_cell\" organization_id=\"cbc2fd10-2aa8-4c56-9d3b-a4f7f974036f\" organization_name=\"DigitalINVOrg\" origin=\"rep\" process_id=\"f07381b0-52b1-4f7f-984e-60ebbfe6825d\" process_instance_id=\"358d5723-b911-4f06-7b3d-827f\" process_type=\"web\" product=\"VMware Tanzu Application Service\" source_id=\"f07381b0-52b1-4f7f-984e-60ebbfe6825d\" source_type=\"APP/PROC/WEB\" space_id=\"f08b668b-d3cd-410b-a7e6-488e6a1770b5\" space_name=\"PROD\" system_domain=\"sp1.pcf.dell.com\"] 2021-02-27 03:52:07.007 ERROR 15 --- [nio-8080-exec-1] c.d.p.e.e.service.ErrorRoutingService    : [ASN_ID:FG30220028229] No Records Found to update status., 2021-02-27 03:52:07.007 ERROR 15 --- [nio-8080-exec-1] c.d.p.e.e.service.ErrorRoutingService    : [ASN_ID:FG30220028229] No Records Found to update status.";
        String var = message.toString();
        parseMessage(var);
    }
    public static HashMap getDetails(String var){
        String orgName="DigitalINVOrg";
        String error="ERROR";
        HashMap details=new HashMap();
        for(int i=0;i<var.length();i++){
            if(!details.containsKey("appName") && i+orgName.length()<var.length()) {
                if (var.startsWith(orgName, i)) {
                    String temp = var.substring(i + orgName.length() + 1);
                    details.put("appName",temp.substring(temp.indexOf('.') + 1, temp.indexOf(' ')));
                }
            }
            if(!details.containsKey("errorMessage") && i+error.length()<var.length()) {
                if (var.startsWith(error, i)) {
                    String temp=var.substring(i + error.length());
                    details.put("errorMessage",temp.substring(temp.indexOf(":")+1));
                }
            }
        }
        return details;
    }
    public static void test(String var){
        if(val.containsKey(var)){
            String msg= new Date().toString();
            val.get(var).add(msg);
            System.out.println(val.get(var).size());
        }
        else{
            ArrayList temp=new ArrayList();
            temp.add("one");
            val.put(var,temp);
        }
    }
    public static void parseMessage(String var){
        HashMap details=getDetails(var);
        System.out.println(details.toString());
        test("a");
        test("b");
        test("c");
        test("a");
        test("b");
        test("c");
        System.out.println(val.toString());
    }
}

