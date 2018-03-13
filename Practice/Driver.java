import java.util.*;

public class Driver{

  private static int SYSTEMS_IN_CLUSTERS = 0;
  private static Set<System> systems;
  private static Set<Cluster> clusters;

  private static Set<System> deploy(Set<System> systems, Set<Cluster> clusters){

    ArrayList<System> systems_list =  new ArrayList<>(systems);
    for(Cluster c:clusters){
          ArrayList<System> instances_current_cluster = c.getInstances();
          for(int j=0;j<systems_list.size();j++){
            while(systems_list.size() > 0 && instances_current_cluster.size() < SYSTEMS_IN_CLUSTERS){
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
      //systems.add(new System());
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
      Cluster c2 = new Cluster("Cluster2");

      clusters = new LinkedHashSet<>();
      clusters.add(c1);
      clusters.add(c2);
      Set<System> undeployed = deploy(systems, clusters);
      for(System u:undeployed){
        java.lang.System.out.println(u.toString() + " System not deployed");
      }

      //c1.removeInstance(s2);

      // for(Cluster c:clusters){
      //   java.lang.System.out.println(c.toString() + " cluster");
      //   for(System s:c.getInstances()){
      //     java.lang.System.out.println(s.toString() + " deployed to: "+s.getClusterName());
      //   }
      //   java.lang.System.out.println();
      // }

      // for(System s:systems){
      //   if(s.getClusterName() == null){
      //     java.lang.System.out.println(s.toString() + " not deployed");
      //   }else{
      //     java.lang.System.out.println(s.toString() + " deployed to " + s.getClusterName());
      //   }
      //
      // }




  }


}
