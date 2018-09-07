package fi.haagahelia.assignment.bookstore.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookstoreController {

	 @RequestMapping(value="/index")
	 public String greetingSubmit() {
	        return "index";
	 }
}
