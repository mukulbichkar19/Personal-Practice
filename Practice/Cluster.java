import java.util.*;
import java.io.*;
public class Cluster{

    private String clusterName;
    private String pattern= "^[a-zA-Z][a-zA-Z0-9]+$";
    private ArrayList<System> instances;

    // Default Constructor
    public Cluster(){}

    /**
     * Customised constructor
     * @param  clusterName name of cluster name
     * @throws Exception   [description]
     */
    public Cluster(String clusterName) throws Exception{
      if(isAlphanumeric(clusterName)){
        this.clusterName = clusterName;
        instances = new ArrayList<>();
      }else{
        throw new Exception("Invalid name format for Cluster Name: "+clusterName+
             " [Should be alphanumeric and start with alphabet only]");
      }
    }

    /**
     * Returns the list of systems
     * @return an arraylist of systems
     */
    public ArrayList<System> getInstances(){
      return this.instances;
    }

    /**
     * Adds an instance i.e. system to the cluster
     * @param instance the system to be added to cluster
     */
    public void addInstance(System instance){
        instances.add(instance);
        instance.setClusterName(this.clusterName);
    }

    /**
     * Removes an instance of the system from cluster
     * @param instance System to be removed
     */
    public void removeInstance(System instance){
      for(int i=0;i<instances.size();i++){
        if(instances.get(i).equals(instance)){
          System instance_removed = instances.get(i);
          instance_removed.unsetClusterName(this.clusterName);
          instances.remove(i);
        }
      }
    }

    /**
     * Checks whether the String satisfies the pattern i.e. starts with
     * alphabet and contains alphanumeric
     * @param  s clustename
     * @return true if critirea is met or false if not
     */
    private boolean isAlphanumeric(String s){
      return s.matches(pattern);
    }

    // toString(): Returns the cluster name
    public String toString(){
      return this.clusterName;
    }



}
