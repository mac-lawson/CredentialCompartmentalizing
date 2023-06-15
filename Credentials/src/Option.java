import java.util.HashMap;
import java.util.Map;

public class Option<T> {
    private T value;
    private String name;
    private String description;
    
    public Option(String name) {
        this.name = name;
        this.description = "";
    }
    
    public Option(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
}

class IntOption extends Option<Integer> {
    public IntOption(String name) {
        super(name);
    }
    
    public IntOption(String name, String description) {
        super(name, description);
    }
}

class Options {
    private Map<String, Option<?>> optionsMap;
    private String programName;
    
    public Options(String programName) {
        this.programName = programName;
        optionsMap = new HashMap<>();
    }
    
    public void register(String name, Option<?> option) {
        optionsMap.put(name, option);
    }
    
    public void process(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (optionsMap.containsKey(arg)) {
                Option<?> option = optionsMap.get(arg);
                if (option instanceof IntOption) {
                    if (i + 1 < args.length) {
                        try {
                            int value = Integer.parseInt(args[i + 1]);
                            ((IntOption) option).setValue(value);
                            i++;  // skip the next argument
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid value for option: " + arg);
                        }
                    } else {
                        System.out.println("Missing value for option: " + arg);
                    }
                }
            }
        }
    }
}
