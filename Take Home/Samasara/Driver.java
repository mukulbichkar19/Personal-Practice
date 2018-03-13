import java.util.*;

public class Driver{

  // MAGIC CONSTANT
  private static int SYSTEMS_IN_CLUSTERS = 0;
  // Set of systems and clusters
  private static Set<System> systems;
  private static Set<Cluster> clusters;

  /**
   * Deploy this function deploys system to clusters
   * @param  systems  Set of systems to be deployed
   * @param  clusters Set of clusters
   * @return Set of Systems that are not deployed
   */
  private static Set<System> deploy(Set<System> systems, Set<Cluster> clusters){

    // Edge case: If no systems are present return an empty set of undeployed
    // systems or if set of clusters is empty then return the entire set of
    // systems since they will be undeployed
    if(systems.size() == 0){
      return new HashSet<>();
    }else if(clusters.size() == 0){
      return systems;
    }
    ArrayList<System> systems_list =  new ArrayList<>(systems);
    for(Cluster c:clusters){
          ArrayList<System> instances_current_cluster = c.getInstances();
          for(int j=0;j<systems_list.size();j++){
            while(systems_list.size() > 0 && instances_current_cluster.size() <
                  SYSTEMS_IN_CLUSTERS){
              c.addInstance(systems_list.get(j));
              systems_list.remove(systems_list.get(j));
            }
          }
    }
    return new HashSet<>(systems_list);
  }


  private static void setSystemsInCluster(int n){
      SYSTEMS_IN_CLUSTERS = n;
  }



  public static void main(String args[]) throws Exception{
      setSystemsInCluster(5);
      systems = new LinkedHashSet<>();
      System s1 = new System("System1");
      System s2 = new System("System2");
      System s3 = new System("System3");
      System s4 = new System("System4");
      System s5 = new System("System5");
      System s6 = new System("System6");
      System s7 = new System("System7");
      System s8 = new System("System8");

      systems.add(s1);
      systems.add(s2);
      systems.add(s3);
      systems.add(s4);
      systems.add(s5);
      systems.add(s6);
      systems.add(s7);
      systems.add(s8);

      Cluster c1 = new Cluster("Cluster1");
      // Cluster c2 = new Cluster("Cluster2");

      clusters = new LinkedHashSet<>();
      clusters.add(c1);
      //clusters.add(c2);
      Set<System> undeployed = deploy(systems, clusters);
      for(System u:undeployed){
        java.lang.System.out.println(u.toString() + " system not deployed");
      }
  }


}
