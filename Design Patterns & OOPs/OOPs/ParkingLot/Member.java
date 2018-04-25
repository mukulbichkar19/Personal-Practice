public class Member extends Customer{

  public Member(){ super(); }

  private boolean isMember;

  public Member(int id, String f_name, String l_name, String dl){
    super(id, f_name, l_name, dl);
    this.isMember = true;
  }

  public boolean isMember(){
    return this.isMember;
  }

}
