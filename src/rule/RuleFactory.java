package rule;

import domain.Order;
import rule.list.NdslCantBeTogetherWithAdslThk;

import java.util.ArrayList;
import java.util.List;

public class RuleFactory {


    public static List<Rule> GetOrderRules(Order order) {
        List<Rule> list = new ArrayList<Rule>() {{
            add(new NdslCantBeTogetherWithAdslThk(order));
        }};
        return list;

    }
}
