package domain;

import rule.Rule;
import rule.RuleFactory;
import rule.ValidationResult;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public Order()
    {
        this.offerings=new ArrayList<Offering>();
        this.ValidationResults=new ArrayList<ValidationResult>();
    }


    public int id;
    public List<Offering> offerings;
    public List<ValidationResult> ValidationResults;



    public void Validate()
    {
        List<Rule> rules = RuleFactory.GetOrderRules(this);
        for (Rule rule : rules) {
            ValidationResult result = rule.Validate();
            if (!result.IsValid) {
                this.ValidationResults.add(result);
            }
        }
    }
}
