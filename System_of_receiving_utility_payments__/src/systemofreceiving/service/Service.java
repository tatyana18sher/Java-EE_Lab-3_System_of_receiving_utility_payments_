package systemofreceiving.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_id;
 
    private String service_name;
    private String client;
    private float payment;
 
    protected Service() {
    }
 
    protected Service(String service_name, String client, float payment) {
        this.service_name = service_name;
        this.client = client;
        this.payment = payment;
    }
    
    public long getServiceId() {
        return service_id;
    }
 
    public void setServiceId(long service_id) {
        this.service_id = service_id;
    }
 
    public String getServiceName() {
        return service_name;
    }
 
    public void setServiceName(String service_name) {
        this.service_name = service_name;
    }
 
    public String getClient() {
        return client;
    }
 
    public void setClient(String client) {
        this.client = client;
    }
 
    public float getPayment() {
        return payment;
    }
 
    public void setPayment(float payment) {
        this.payment = payment;
    }
	

}
