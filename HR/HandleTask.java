package HR;

import java.util.List;

// HandleTask interface
public interface HandleTask {

    /**
     * abstract method of newsAnnounce(), employeeStatus(), getPayment()
     */
    List<String> showNewsAndMessages();
    void employStatus();
}
