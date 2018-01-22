package domain;

public class Offering {
    public int id;
    public String idCode;
    public Order order;

    public Offering(String idCode){
      this.idCode=idCode;
    }
}
