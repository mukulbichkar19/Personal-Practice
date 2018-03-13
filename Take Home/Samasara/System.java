import java.util.*;
import java.io.*;
public class System{

  private String hostName;
  private String clusterName;
  private String pattern= "^[a-zA-Z][a-zA-Z0-9]+$";

  // Default constructor
  public System(){}

  // Customised constructor
  public System(String hostName) throws Exception{
    if(isAlphanumeric(hostName)){
        this.hostName = hostName;
      }else{
        throw new Exception("Invalid name format for System Name: "+hostName
          +" [Should be alphanumeric and start with alphabet only] ");
      }
  }

  // toString(): Returns the host name
  public String toString(){
    return this.hostName;
  }

   /**
   * Sets the clustername
   * @param clusterName the cluster name
   */
  public void setClusterName(String clusterName){
     this.clusterName = clusterName;
  }

/**
 * Unsets the cluster name
 * @param clusterName [description]
 */
  public void unsetClusterName(String clusterName){
     this.clusterName = null;
  }

  /**
   * Returns the current the cluster name
   * @return the cluster name
   */
  public String getClusterName(){
    return this.clusterName;
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

}
