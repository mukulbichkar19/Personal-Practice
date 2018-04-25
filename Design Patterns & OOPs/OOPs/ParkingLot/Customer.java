abstract class Customer{

  protected int customer_id;
  protected String f_name;
  protected String l_name;
  protected String drivers_license;
  protected boolean isMember;

  public Customer(){}

  public Customer(int customer_id, String f_name,
                  String l_name, String drivers_license){
    this.customer_id = customer_id;
    this.f_name = f_name;
    this.l_name = l_name;
    this.drivers_license = drivers_license;
  }

  public abstract boolean isMember();
  public int getId(){ return this.customer_id; }
  public String getFName(){ return this.f_name; }
  public String getLName(){ return this.l_name; }
  public String getDL(){ return this.drivers_license; }

}
