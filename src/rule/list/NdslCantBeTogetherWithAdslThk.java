package rule.list;

import domain.Order;
import rule.ValidationResult;
import rule.Rule;

public class NdslCantBeTogetherWithAdslThk extends Rule {
    public ValidationResult result;
    Order order;
    String message = "Adsl THK siparişlerinde Ndsl sunusu eklenemez";

    public NdslCantBeTogetherWithAdslThk(Order order) {
        this.order = order;
    }

    @Override
    public ValidationResult Validate() {

        if (order.offerings.stream().anyMatch(x -> x.idCode == "ADSL")
                && order.offerings.stream().anyMatch(x -> x.idCode == "THK")
                && order.offerings.stream().anyMatch(x -> x.idCode == "NDSL")) {
            {
                this.result=new ValidationResult();

                this.result.IsValid = false;
                this.result.Message = message;
            }
        }

        return result;
    }

    @Override
    public void Execute(){
        order.offerings.removeIf(x->x.idCode=="NDSL");
    }
}
