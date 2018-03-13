import java.util.*;
import java.io.*;
public class Cluster{

    private String clusterName;
    private String pattern= "^[a-zA-Z][a-zA-Z0-9]+$";
    private ArrayList<System> instances;

    public Cluster(){

    }

    public Cluster(String clusterName) throws Exception{
      if(isAlphanumeric(clusterName)){
        this.clusterName = clusterName;
        instances = new ArrayList<>();
      }else{
        throw new Exception("Invalid name format for Cluster Name: "+this.clusterName);
      }
    }

    public ArrayList<System> getInstances(){
      return this.instances;
    }

    public void addInstance(System instance){
        instances.add(instance);
        instance.setClusterName(this.clusterName);
    }

    public void removeInstance(System instance){
      for(int i=0;i<instances.size();i++){
        if(instances.get(i).equals(instance)){
          System instance_removed = instances.get(i);
          instance_removed.unsetClusterName(this.clusterName);
          instances.remove(i);

        }
      }
    }

    private boolean isAlphanumeric(String s){
      return s.matches(pattern);
    }

    public String toString(){
      return this.clusterName;
    }



}
