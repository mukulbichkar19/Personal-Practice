import java.util.*;
import java.io.*;
public class System{

  private String hostName;
  private String clusterName;
  private String pattern= "^[a-zA-Z][a-zA-Z0-9]+$";

  public System(){

  }

  public System(String hostName) throws Exception{
    if(isAlphanumeric(hostName)){
        this.hostName = hostName;
      }else{
        throw new Exception("Invalid name format for System Name: "+hostName
          +" [Should be alphanumeric and start with alphabet only] ");
      }

  }

  public String toString(){
    return this.hostName;
  }

  public void setClusterName(String clusterName){
     this.clusterName = clusterName;
  }

  public void unsetClusterName(String clusterName){
     this.clusterName = null;
  }

  public String getClusterName(){
    return this.clusterName;
  }

  private boolean isAlphanumeric(String s){
    return s.matches(pattern);
  }

}
