package day32_arrays_split;
/*
Deploying etsy to us-east-1...
Deployment completed for us-east-1


Deploying etsy to us-west-1...
Deployment completed for us-west-1

Deploying etsy to us-west-2...
Deployment completed for us-west-2

---All deployments complete----
 */
public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-------Starting deployment of etsy app to AWS zones----------");
        String[] zonesToDeploy = zones.split(",");
        for (String eachZone : zonesToDeploy ){
            System.out.println("Deploying ["+app+"] to " + eachZone +".....");
            System.out.println("Deployment complete for = " + eachZone +"....");
        }
        System.out.println("---All deployments complete---- and enabled");
    }
}
