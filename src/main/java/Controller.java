import models.Randomiser;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;

    public class Controller {

        public static void main(String[] args) {

            VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
            staticFileLocation("/public");


            get("/one", (req, res) -> {
                Randomiser randomiser = new Randomiser();
                String result = randomiser.assignARandomName();

                HashMap<String, Object> model = new HashMap<>();
                model.put("randomame", result);
                model.put("template", "oneStudent.vtl");
                return new ModelAndView(model, "layout.vtl");
            }, velocityTemplateEngine);


            get("/two", (req, res) -> {
                Randomiser randomiser = new Randomiser();
                ArrayList<String> results = randomiser.listRandomNames(2);


                HashMap<String, Object> model = new HashMap<>();
                model.put("group", results);
                model.put("template", "twoStudent.vtl");
                return new ModelAndView(model, "layout.vtl");
            }, velocityTemplateEngine);


        }


    }

