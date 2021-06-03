import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
public class App {
    public static void main(String[] args) {

        get("/", (req, res) -> {
            //just for testing - make two new objects so we have something to retrieve
            Rectangle rectangle = new Rectangle(3,2);
            Rectangle otherRectangle = new Rectangle(12, 12);

            Map<String, ArrayList<Rectangle>> model = new HashMap<>();
            ArrayList myRectangleArrayList = Rectangle.getAll();
            model.put("myRectangles", myRectangleArrayList);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/width", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
