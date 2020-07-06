import javax.script.*;

public class Main {

    public static void main(String[] args) throws Exception {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("groovy");

        System.out.println(engine.eval("(1..10).sum()"));
  }
}