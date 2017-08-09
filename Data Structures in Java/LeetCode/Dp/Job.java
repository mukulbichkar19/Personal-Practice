public class Job{

  int start;
  int end;
  int weight;

  public Job(int start, int end, int weight){
    this.start = start;
    this.end = end;
    this.weight = weight;
  }

  public int getEndTime(){
    return this.end;
  }

  public int getStartTime(){
    return this.start;
  }

  public int getWeight(){
    return this.weight;
  }


}
