package fi.haagahelia.assignment.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.assignment.bookstore.domain.Book;
import fi.haagahelia.assignment.bookstore.domain.BookstoreRepository;
import fi.haagahelia.assignment.bookstore.domain.CategoryRepository;

@Controller
public class BookstoreController {
	@Autowired
	private BookstoreRepository bookRepo;
	@Autowired
	private CategoryRepository categoryRepo;

	@GetMapping("/booklist")
	public String index(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		model.addAttribute("books", bookRepo.findAll());
		return "booklist";
	}

    @RequestMapping(value = "/add")
    public String addStudent(Model model){
    	model.addAttribute("book", new Book());
    	model.addAttribute("categories", categoryRepo.findAll());
        return "addbook";
    }     
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Book book){
    	bookRepo.save(book);
        return "redirect:booklist";
    }    

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable("id") Long bookId, Model model) {
    	bookRepo.deleteById(bookId);
        return "redirect:../booklist";
    }     

}
