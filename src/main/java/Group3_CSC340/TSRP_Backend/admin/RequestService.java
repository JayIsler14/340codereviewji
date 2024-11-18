package Group3_CSC340.TSRP_Backend.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request getRequestById(int r_Id) {
        return requestRepository.findById(r_Id).orElse(null);
    }

    public void addNewRequest(Request request) {
        requestRepository.save(request);
    }

    public void updateRequest(int r_Id, Request request) {
        Request existing = getRequestById(r_Id);
        existing.setSender(request.getSender());
        existing.setR_Status(request.getR_Status());
        existing.setDescription(request.getDescription());

        requestRepository.save(existing);
    }

    public void deleteRequestById(int r_Id) {
        requestRepository.deleteById(r_Id);
    }
}
