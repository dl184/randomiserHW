import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;

public class RandomiserController {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");


        ArrayList<String> names = new ArrayList<String>();
        names.add("Derek");
        names.add("Adri");
        names.add("Jack");
        names.add("Roddy");
        names.add("Pete");
        names.add("Cleyra");
        names.add("Tara");
        names.add("Campbell");
        names.add("Stevie");
        names.add("Richard");
        names.add("Greg");
        names.add("Stephan");
        names.add("Angelina");
        names.add("Matt");
        names.add("Craig");
        names.add("Joe");
        names.add("Debi");
        names.add("Farheen");
        names.add("Harjit");



        get("/one", (req, res) -> {

            Collections.shuffle(names);
            String name1 = names.get(0);
            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", name1);
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);



        get("/two", (req, res) -> {

            Collections.shuffle(names);
            String name1 = names.get(0);
            String name2 = names.get(1);

            HashMap<String, Object> model = new HashMap<>();
            ArrayList<String> result = new ArrayList<>();
            result.add(name1);
            result.add(name2);
            model.put("name1", name1);
            model.put("name2", name2);
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


    }


}
