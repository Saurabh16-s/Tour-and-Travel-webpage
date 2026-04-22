package trippy.backend.controller;




import org.springframework.web.bind.annotation.*;
import trippy.backend.model.Contact;
import trippy.backend.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }


    @PostMapping
    public Contact save(@RequestBody Contact contact) {
        return service.saveMessage(contact);
    }

    @GetMapping
    public List<Contact> getAll() {
        return service.getAllMessages();
    }
}
