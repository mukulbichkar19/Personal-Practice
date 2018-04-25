public class Guest extends Customer{

  private boolean isMember;

  public Guest(){ super(); }

  public Guest(int id, String f_name, String l_name, String dl){
    super(id, f_name, l_name, dl);
    this.isMember = false;
  }

  public boolean isMember(){
    return this.isMember;
  }

}
