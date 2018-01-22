package rule;

public abstract class Rule {

    public String message;
    public String iddCode;
    public RuleType type;

    public ValidationResult Validate(){
        return new ValidationResult();
    }

    public void Execute(){
    }
}
