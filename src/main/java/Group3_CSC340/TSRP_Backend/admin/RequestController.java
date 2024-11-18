package Group3_CSC340.TSRP_Backend.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    private RequestService service;

    @GetMapping("/all")
    public List<Request> getAllRequests() {
        return service.getAllRequests();
    }

    @GetMapping("/{r_Id}")
    public Request getOneRequest(@PathVariable int r_Id) {
        return service.getRequestById(r_Id);
    }

    @PostMapping("/new")
    public List<Request> addNewRequest(@RequestBody Request request) {
        service.addNewRequest(request);
        return service.getAllRequests();
    }

    @PutMapping("/update/{r_Id}")
    public Request updateRequest(@PathVariable int r_Id, @RequestBody Request request) {
        service.updateRequest(r_Id, request);
        return service.getRequestById(r_Id);
    }

    @DeleteMapping("/delete/{r_Id}")
    public List<Request> deleteRequestById(@PathVariable int r_Id) {
        service.deleteRequestById(r_Id);
        return service.getAllRequests();
    }
}