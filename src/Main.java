import domain.Offering;
import domain.Order;
import rule.ValidationResult;

public class Main {

    public static void main(String[] args) {


        Order order = new Order();
        order.offerings.add(new Offering("ADSL"));
        order.offerings.add(new Offering("THK"));
        order.offerings.add(new Offering("NDSL"));
        order.Validate();


        for (ValidationResult result : order.ValidationResults) {
            System.out.println(result.Message);

        }

    }
}
