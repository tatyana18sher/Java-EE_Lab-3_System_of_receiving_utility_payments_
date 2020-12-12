package systemofreceiving.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class ServiceService {
    @Autowired ServiceRepository repo;
     
    public void save(Service service) {
        repo.save(service);
    }
     
    public List<Service> listAll() {
        return (List<Service>) repo.findAll();
    }
     
    public Service get(Long service_id) {
        return (Service) repo.findById(service_id).get();
    }
     
    public void delete(Long service_id) {
        repo.deleteById(service_id);
    }
     
}