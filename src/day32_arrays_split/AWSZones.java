package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String Zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("Stsrting deployment of esty app to AWS Zones--");
        String[] ZonesToDeploy = Zones.split(",");
        for (String eachZones : ZonesToDeploy){
            System.out.println("Deploying ["+app+"] to " +eachZones+ "...");
        }
    }
}
